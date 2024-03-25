package com.example.appfoodch4.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Food(
    val name: String,
    val price: String,
    val detailfood: String,
    val imagefoodPictUrl: String,
    val locationPictUrl: String,
    val location: String,
    val detailLocation : String
) : Parcelable
