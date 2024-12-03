package com.carlos.flores.rickandmorti.presentation.weather

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.carlos.flores.rickandmorti.domain.model.Weather


@Composable
fun WeatherContent(weather: Weather) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        // Temperature and Condition Section
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 32.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "${weather.temperature}°",
                color = Color.White,
                fontSize = 32.sp,
                fontWeight = FontWeight.Normal
            )
            Text(
                text = weather.text,
                color = Color.White,
                fontSize = 24.sp,
                fontWeight = FontWeight.Normal
            )
        }

        Text(
            text = weather.location,
            color = Color.White,
            fontSize = 24.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Lat: ${weather.latitude}",
                color = Color.White,
                fontSize = 20.sp
            )
            Text(
                text = "Long: ${weather.longitude}",
                color = Color.White,
                fontSize = 20.sp
            )
        }

        Text(
            text = weather.time,
            color = Color(0xFF4A9DED),
            fontSize = 18.sp,
            modifier = Modifier.padding(top = 16.dp)
        )
    }
}

/*
@Preview(showBackground = true)
@Composable
fun WeatherContentPreview() {
    WeatherContent(
        Weather(
            latitude = "19.432",
            location = "México City, Mexico",
            longitude = "-99.134",
            temperature = "76",
            text = "Mostly cloudy",
            time = "2024-12-03 13:03:11"
        )
    )
}*/
