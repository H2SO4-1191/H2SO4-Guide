package com.h2so4.h2so4_guide.model

class Category(val name: String, val image: String) {
    override fun toString(): String {
        return this.name
    }
}