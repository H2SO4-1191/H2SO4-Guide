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
        val categoryView: View
        val holder: ViewHolder
        if(convertView == null) {
            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_layout, null)
            holder = ViewHolder()
            holder.categoryName = categoryView.findViewById(R.id.categoryName)
            holder.categoryImage = categoryView.findViewById(R.id.categoryImage)
            categoryView.tag = holder
        } else {
            holder = convertView.tag as ViewHolder
            categoryView = convertView
        }
        val category = categories[position]
        val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        holder.categoryImage?.setImageResource(resourceId)
        holder.categoryName?.text = category.name
        return categoryView
    }
    private class ViewHolder {
        var categoryImage: ImageView? = null
        var categoryName: TextView? = null
    }
}

/*
To implement it:

    private lateinit var adapter: CategoryAdapter
    adapter = CategoryAdapter(this, DataService.categories) { category ->
            Toast.makeText(this, category.name, Toast.LENGTH_SHORT).show()
        }
    ui.categoriesList.adapter = adapter

    Note: Must use ListView
 */