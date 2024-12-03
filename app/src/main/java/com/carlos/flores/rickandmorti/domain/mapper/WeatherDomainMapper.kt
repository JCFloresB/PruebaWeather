package com.carlos.flores.rickandmorti.domain.mapper

import com.carlos.flores.rickandmorti.data.remote.dto.WeatherRequestDTO
import com.carlos.flores.rickandmorti.domain.model.Weather

object WeatherDomainMapper {
    fun Weather.toData(): WeatherRequestDTO {
        return WeatherRequestDTO(
            latitude = latitude,
            location = location,
            longitude = longitude,
            temperature = temperature,
            text = text,
            time = time,
        )
    }
}