package com.davengerdev.cateye

data class Cat(
    val id: Long, val index: Int, val name: String, val type: String, val ubication: String,
    val heightFemale: Double, val heightMale: Double, val imageUrl: String,
    val lifeExpectancy: String, val temperament: String, val weightFemale: Double,
    val weightMale: Double
)