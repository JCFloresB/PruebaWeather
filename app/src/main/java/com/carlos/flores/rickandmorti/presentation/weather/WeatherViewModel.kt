package com.carlos.flores.rickandmorti.presentation.weather

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.carlos.flores.rickandmorti.domain.model.Weather
import com.carlos.flores.rickandmorti.domain.model.WeatherState
import com.carlos.flores.rickandmorti.domain.usecases.weather.GetWeatherUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class WeatherViewModel @Inject constructor(
    private val weatherUseCase: GetWeatherUseCase,
): ViewModel() {
    private val _state = MutableStateFlow<WeatherState>(WeatherState())
    val state: StateFlow<WeatherState> = _state.asStateFlow()

    fun getWeather() {
        viewModelScope.launch {
            _state.update { it.copy(isLoading = true) }

            val request = Weather(
                latitude = "19.432",
                location = "México City, Mexico",
                longitude = "-99.134",
                temperature = "76",
                text = "Mostly cloudy",
                time = "2024-12-03 13:03:11"
            )

            weatherUseCase(request)
                .catch { exception ->
                    _state.update {
                        it.copy(
                            isLoading = false,
                            error = exception.message
                        )
                    }
                }
                .collect { weather ->
                    _state.update {
                        it.copy(
                            weather = weather,
                            isLoading = false,
                            error = null
                        )
                    }
                }
        }
    }
}