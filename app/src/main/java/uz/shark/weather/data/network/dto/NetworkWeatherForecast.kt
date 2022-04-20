package uz.shark.weather.data.network.dto

import com.google.gson.annotations.SerializedName
import com.mayokunadeniyi.instantweather.data.model.NetworkWeatherCondition

data class NetworkWeatherForecast(

    val id: Int,

    @SerializedName("dt_txt")
    val date: String,

    val wind: Wind,

    @SerializedName("weather")
    val networkWeatherDescription: List<NetworkWeatherDescription>,

    @SerializedName("main")
    val networkWeatherCondition: NetworkWeatherCondition
)
