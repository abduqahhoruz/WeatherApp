package uz.shark.weather.domain


import androidx.annotation.Keep

@Keep
data class WeatherLocal(
    val description: String, // clear sky
    val icon: String, // 01d
    val temp: Double, // Clear
    val cityName: String,
    val windSpeed: Double,
    val humidity: Double,
    val pressure: Double
)