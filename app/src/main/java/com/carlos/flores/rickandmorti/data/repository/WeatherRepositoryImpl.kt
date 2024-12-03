package com.carlos.flores.rickandmorti.data.repository

import com.carlos.flores.rickandmorti.data.mapper.WeatherMapper.toDomain
import com.carlos.flores.rickandmorti.data.remote.api.ApiService
import com.carlos.flores.rickandmorti.data.remote.dto.WeatherRequestDTO
import com.carlos.flores.rickandmorti.domain.repository.WeatherRepository
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api: ApiService,
): WeatherRepository {

    override fun getWeather(request: WeatherRequestDTO) = flow {
        val response = api.getWeatherData(request)
        emit(response.toDomain())
    }
}