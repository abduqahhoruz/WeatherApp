package uz.shark.weather.data.network.dto

import com.mayokunadeniyi.instantweather.data.model.NetworkWeatherCondition
data class WeatherForecast(
    val uID: Int,

    var date: String,

    val wind: Wind,

    val networkWeatherDescription: List<NetworkWeatherDescription>,

    val networkWeatherCondition: NetworkWeatherCondition
)
