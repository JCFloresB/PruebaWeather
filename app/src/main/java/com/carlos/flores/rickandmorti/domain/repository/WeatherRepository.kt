package com.carlos.flores.rickandmorti.domain.repository

import com.carlos.flores.rickandmorti.data.remote.dto.WeatherRequestDTO
import com.carlos.flores.rickandmorti.domain.model.Weather
import kotlinx.coroutines.flow.Flow

interface WeatherRepository {
    fun getWeather(request: WeatherRequestDTO): Flow<Weather>
}