package com.h2so4.h2so4_guide.controller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.h2so4.h2so4_guide.adapters.CategoryAdapter
import com.h2so4.h2so4_guide.databinding.ActivityHomeBinding
import com.h2so4.h2so4_guide.services.DataService

class HomeActivity : AppCompatActivity() {
    private lateinit var adapter: CategoryAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val ui = ActivityHomeBinding.inflate(layoutInflater)
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
        setContentView(ui.root)
        adapter = CategoryAdapter(this, DataService.categories)
        ui.categoriesList.adapter = adapter
    }
}