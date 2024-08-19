package com.h2so4.h2so4_guide.controller

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.ai.client.generativeai.GenerativeModel
import com.h2so4.h2so4_guide.R
import com.h2so4.h2so4_guide.databinding.ActivityPickBinding
import com.h2so4.h2so4_guide.model.Product
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch

@Suppress("DEPRECATION")
class PickActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val ui = ActivityPickBinding.inflate(layoutInflater)
        setContentView(ui.root)
        val product = intent.getParcelableExtra<Product>("pick")
        val resourceId = this.resources.getIdentifier(product?.image, "drawable", this.packageName)
        ui.pick.setImageResource(resourceId)
        ui.title.text = product?.name
        ui.price.text = product?.price.toString().plus(" $")
        val ai = GenerativeModel("gemini-pro", "AIzaSyDGXcrHbLcJFrxOdIZzvNp-tU2cgy4b7V0")
        MainScope().launch {
            try {
                ui.description.text = ai.generateContent("Make a 50 words commercial about ${product?.name} but leave no blank spaces or empty lines").text.toString()
            } catch(e: Exception) {
                ui.description.text = "Failed to load description, check your internet connection."
            }
        }
        ui.order.setOnClickListener {
            ui.order.animate().apply {
                duration = 500
                translationX(1000f)
            }.start()
            ui.price.animate().apply {
                duration = 500
                translationX(-1000f)
            }.withEndAction {
                finish()
                Toast.makeText(this, "Thank you for your purchase!", Toast.LENGTH_LONG).show()
            }
        }
    }
}