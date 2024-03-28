package com.example.appfoodch4.data.repository

import com.example.appfoodch4.data.datasource.category.CategoryDataSource
import com.example.appfoodch4.data.model.Category


interface CategoryRepository{
    fun getCategories(): List<Category>
}

class CategoryRepositoryImpl(private val dataSource: CategoryDataSource) : CategoryRepository{
    override fun getCategories(): List<Category> = dataSource.getCategories()
    }
