package com.example.appfoodch4.data.datasource.category

import com.example.appfoodch4.data.model.Category

interface CategoryDataSource {
    fun getCategories(): List<Category>
}