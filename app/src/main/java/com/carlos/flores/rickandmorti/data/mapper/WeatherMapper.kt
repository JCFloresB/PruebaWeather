package com.carlos.flores.rickandmorti.data.mapper

import com.carlos.flores.rickandmorti.data.remote.dto.WeatherResponseDTO
import com.carlos.flores.rickandmorti.domain.model.Weather

object WeatherMapper {
    fun WeatherResponseDTO.toDomain(): Weather {
        return Weather(
            latitude = latitude,
            location = location,
            longitude = longitude,
            temperature = temperature,
            text = text,
            time = time,
        )
    }
}