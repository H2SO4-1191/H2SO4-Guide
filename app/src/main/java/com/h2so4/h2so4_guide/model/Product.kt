package com.h2so4.h2so4_guide.model

class Product(val name: String, val price: Float, val image: String) {
    override fun toString(): String {
        return this.name
    }
}