package com.h2so4.h2so4_guide.controller

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.h2so4.h2so4_guide.adapters.CategoryRecycleAdapter
import com.h2so4.h2so4_guide.databinding.ActivityHomeBinding
import com.h2so4.h2so4_guide.services.DataService

class HomeActivity : AppCompatActivity() {
    private lateinit var adapter: CategoryRecycleAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val ui = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(ui.root)
        logoAnimate(ui)
        setAdapter(ui)

    }
    private fun setAdapter(ui: ActivityHomeBinding) {
        adapter = CategoryRecycleAdapter(this, DataService.categories) { category ->
            val productsIntent = Intent(this, ProductsActivity::class.java)
            productsIntent.putExtra("category", category.name)
            startActivity(productsIntent)
        }
        ui.categoriesList.adapter = adapter
        ui.categoriesList.layoutManager = LinearLayoutManager(this)
        ui.categoriesList.setHasFixedSize(true)
    }
    private fun logoAnimate(ui: ActivityHomeBinding) {
        ui.logo.animate().apply {
            duration = 5000
            rotation(360f)
        }.withEndAction {
            ui.h2so4.animate().apply {
                duration = 3000
                rotationXBy(360f)
            }.start()
            ui.store.animate().apply {
                duration = 3000
                rotationXBy(360f)
            }.start()
        }.start()
    }
}