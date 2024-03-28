package com.example.appfoodch4.data.repository

import com.example.appfoodch4.data.datasource.food.FoodDataSource
import com.example.appfoodch4.data.model.Food


interface FoodRepository{
    fun getFoods(): List<Food>
}

class FoodRepositoryImlp(private val dataSource: FoodDataSource) : FoodRepository{
    override fun getFoods(): List<Food> = dataSource.getFoodMenu()
    }
