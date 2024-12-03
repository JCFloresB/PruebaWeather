package com.carlos.flores.rickandmorti.domain.model

data class Weather(
    val latitude: String,
    val location: String,
    val longitude: String,
    val temperature: String,
    val text: String,
    val time: String
)
