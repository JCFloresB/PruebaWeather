package com.carlos.flores.rickandmorti.domain.model

data class WeatherState(
    val weather: Weather? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)