package uz.shark.weather.data.network.dto

import android.os.Parcelable
import com.mayokunadeniyi.instantweather.data.model.NetworkWeatherCondition
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Weather(
    val uId: Int,
    val cityId: Int,
    val name: String,
    val wind: Wind,
    val networkWeatherDescription: List<NetworkWeatherDescription>,
    val networkWeatherCondition: NetworkWeatherCondition
) : Parcelable
