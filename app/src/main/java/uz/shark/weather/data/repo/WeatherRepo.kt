package uz.shark.weather.data.repo

import kotlinx.coroutines.flow.Flow
import uz.shark.weather.data.network.dto.NetworkWeather
import uz.shark.weather.framework.util.NetworkResult


interface WeatherRepo {
    suspend fun getCurrentWeather(lat: String, lon: String): Flow<NetworkResult<NetworkWeather>>
}