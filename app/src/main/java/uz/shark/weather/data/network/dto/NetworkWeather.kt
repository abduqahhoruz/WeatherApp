package uz.shark.weather.data.network.dto

import com.google.gson.annotations.SerializedName
import com.mayokunadeniyi.instantweather.data.model.NetworkWeatherCondition

data class NetworkWeather(

    val uId: Int,

    @SerializedName("id")
    val cityId: Int,

    val name: String,

    val wind: Wind,

    @SerializedName("weather")
    val networkWeatherDescriptions: List<NetworkWeatherDescription>,

    @SerializedName("main")
    val networkWeatherCondition: NetworkWeatherCondition
)
