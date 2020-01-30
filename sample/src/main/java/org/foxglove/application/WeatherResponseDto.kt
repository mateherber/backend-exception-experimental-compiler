package org.foxglove.application

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import org.foxglove.application.WeatherInfoDto

@Serializable
data class WeatherResponseDto(
    @SerialName("consolidated_weather")
    val consolidatedWeather: List<WeatherInfoDto>
)