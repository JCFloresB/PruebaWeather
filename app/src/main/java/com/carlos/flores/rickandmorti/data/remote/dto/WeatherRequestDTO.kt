package com.carlos.flores.rickandmorti.data.remote.dto

data class WeatherRequestDTO(
    val latitude: String,
    val location: String,
    val longitude: String,
    val temperature: String,
    val text: String,
    val time: String
)
