package com.example.appfoodch4.data.datasource.food

import com.example.appfoodch4.data.model.Food

interface FoodDataSource {
    fun getFoodMenu(): List<Food>
}