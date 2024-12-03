package com.carlos.flores.rickandmorti.data.remote.api

import com.carlos.flores.rickandmorti.data.remote.dto.WeatherRequestDTO
import com.carlos.flores.rickandmorti.data.remote.dto.WeatherResponseDTO
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {
    @POST("weather/")
    suspend fun getWeatherData(@Body request: WeatherRequestDTO): WeatherResponseDTO
}