package com.h2so4.h2so4_guide.controller

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.h2so4.h2so4_guide.R
import com.h2so4.h2so4_guide.adapters.ProductsAdapter
import com.h2so4.h2so4_guide.databinding.ActivityProductsBinding
import com.h2so4.h2so4_guide.services.DataService

class ProductsActivity : AppCompatActivity() {
    private lateinit var adapter: ProductsAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val ui = ActivityProductsBinding.inflate(layoutInflater)
        setContentView(ui.root)
        val clickedCategory = intent.getStringExtra("category")
        ui.category.text = clickedCategory
        setAdapter(ui, clickedCategory)
    }
    private fun setAdapter(ui: ActivityProductsBinding, clickedCategory: String?) {
        adapter = ProductsAdapter(this, DataService.getClickedCategory(clickedCategory)) { product ->
            val pickIntent = Intent(this, PickActivity::class.java)
            pickIntent.putExtra("pick" , product)
            startActivity(pickIntent)
        }
        ui.productsList.adapter = adapter
        val spanCount = if(resources.configuration.orientation == 1 || resources.configuration.screenWidthDp < 720) 2 else 3
        ui.productsList.layoutManager = GridLayoutManager(this, spanCount)
        ui.productsList.setHasFixedSize(true)
    }
}