package com.h2so4.h2so4_guide.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.h2so4.h2so4_guide.R
import com.h2so4.h2so4_guide.model.Category

class CategoryAdapter(private val context: Context, private val categories: List<Category>): BaseAdapter() {
    override fun getCount(): Int {
        return categories.count()
    }
    override fun getItem(position: Int): Any {
        return categories[position]
    }
    override fun getItemId(position: Int): Long {
        return 0
    }
    @SuppressLint("MissingInflatedId", "ViewHolder", "InflateParams", "DiscouragedApi")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView: View = LayoutInflater.from(context).inflate(R.layout.category_list_layout, null)
        val categoryName: TextView = categoryView.findViewById(R.id.categoryName)
        val categoryImage: ImageView = categoryView.findViewById(R.id.categoryImage)
        val category = categories[position]
        val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        categoryImage.setImageResource(resourceId)
        categoryName.text = category.name
        return categoryView
    }
}