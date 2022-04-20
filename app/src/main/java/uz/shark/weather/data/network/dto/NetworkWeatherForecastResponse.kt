package uz.shark.weather.data.network.dto

import com.google.gson.annotations.SerializedName
import uz.shark.weather.data.network.dto.City
import uz.shark.weather.data.network.dto.NetworkWeatherForecast

data class NetworkWeatherForecastResponse(

    @SerializedName("list")
    val weathers: List<NetworkWeatherForecast>,

    val city: City
)
