package com.h2so4.h2so4_guide.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.h2so4.h2so4_guide.R
import com.h2so4.h2so4_guide.model.Category

class CategoryRecycleAdapter(private val context: Context, private val categories: List<Category>, private val itemClick: (Category) -> Unit): RecyclerView.Adapter<CategoryRecycleAdapter.Holder>() {
    inner class Holder(itemView: View, itemClick: (Category) -> Unit) : RecyclerView.ViewHolder(itemView) {
        private val categoryImage: ImageView? = itemView.findViewById(R.id.categoryImage)
        private val categoryName: TextView? = itemView.findViewById(R.id.categoryName)
        @SuppressLint("DiscouragedApi")
        fun bindCategory(context: Context, category: Category) {
            val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
            categoryImage?.setImageResource(resourceId)
            categoryName?.text = category.name
            itemView.setOnClickListener { itemClick(category) }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.category_list_layout, parent, false)
        return Holder(view, itemClick)
    }
    override fun getItemCount(): Int {
        return categories.count()
    }
    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bindCategory(context, categories[position])
    }
}

/*
To implement it:
    private lateinit var adapter: CategoryRecycleAdapter

    adapter = CategoryRecycleAdapter(this, DataService.categories)
    ui.categoriesList.adapter = adapter
    ui.categoriesList.layoutManager = LinearLayoutManager(this)
    ui.categoriesList.setHasFixedSize(true)

    Note: Must use RecycleView
 */