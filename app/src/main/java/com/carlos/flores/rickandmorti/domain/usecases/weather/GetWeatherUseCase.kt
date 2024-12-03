package com.carlos.flores.rickandmorti.domain.usecases.weather

import com.carlos.flores.rickandmorti.domain.mapper.WeatherDomainMapper.toData
import com.carlos.flores.rickandmorti.domain.model.Weather
import com.carlos.flores.rickandmorti.domain.repository.WeatherRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class GetWeatherUseCase @Inject constructor(
    private val repository: WeatherRepository,
) {
    operator fun invoke(request: Weather): Flow<Weather> {
        return repository.getWeather(request.toData()).flowOn(Dispatchers.IO)
    }
}