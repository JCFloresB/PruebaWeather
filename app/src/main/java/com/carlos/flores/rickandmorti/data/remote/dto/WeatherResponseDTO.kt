package com.carlos.flores.rickandmorti.data.remote.dto

import com.google.gson.annotations.SerializedName

data class WeatherResponseDTO(
    @SerializedName("latitude")val latitude: String,
    @SerializedName("location")val location: String,
    @SerializedName("longitude")val longitude: String,
    @SerializedName("temperature")val temperature: String,
    @SerializedName("text")val text: String,
    @SerializedName("time")val time: String
)