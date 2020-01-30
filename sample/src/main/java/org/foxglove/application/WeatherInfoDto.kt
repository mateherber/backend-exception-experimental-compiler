package org.foxglove.application

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class WeatherInfoDto(
    @SerialName("weather_state_name")
    val weatherStateName: String,
    @SerialName("min_temp")
    val minTemp: Double,
    @SerialName("max_temp")
    val maxTemp: Double,
    @SerialName("the_temp")
    val theTemp: Double
)