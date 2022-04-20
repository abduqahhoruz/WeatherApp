package uz.shark.weather.data.datasource

import kotlinx.coroutines.flow.Flow
import retrofit2.Response
import uz.shark.weather.data.network.dto.NetworkWeather


interface WeatherDataSource {
    suspend fun getCurrentWeather(lat: String, lon: String): Response<NetworkWeather>
}