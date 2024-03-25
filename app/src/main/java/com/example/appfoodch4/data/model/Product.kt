package com.example.appfoodch4.data.model
import java.util.UUID

data class Product(
    var id: String = UUID.randomUUID().toString(),
    var name: String,
    var imgUrl: String,
    var price: Double,
    var desc: String,
    var rating: Double,
)