package com.h2so4.h2so4_guide.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.h2so4.h2so4_guide.R
import com.h2so4.h2so4_guide.model.Product

class ProductsAdapter(private val context: Context, private val products: List<Product>, private val itemClick: (Product) -> Unit): RecyclerView.Adapter<ProductsAdapter.Holder>() {
    inner class Holder(itemView: View, itemClick: (Product) -> Unit): RecyclerView.ViewHolder(itemView) {
        private val productImage: ImageView? = itemView.findViewById(R.id.productImage)
        private val productName: TextView? = itemView.findViewById(R.id.productName)
        private val productPrice: TextView? = itemView.findViewById(R.id.productPrice)
        fun bindProduct(context: Context, product: Product) {
            val resourceId = context.resources.getIdentifier(product.image, "drawable", context.packageName)
            productImage?.setImageResource(resourceId)
            productName?.text = product.name
            productPrice?.text = product.price.toString().plus(" $")
            itemView.setOnClickListener { itemClick(product) }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.products_layout, parent, false)
        return Holder(view, itemClick)
    }
    override fun getItemCount(): Int {
        return products.count()
    }
    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bindProduct(context, products[position])
    }
}