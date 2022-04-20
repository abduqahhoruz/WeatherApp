package uz.shark.weather.data.repo

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import uz.shark.weather.data.datasource.WeatherDataSource
import uz.shark.weather.data.network.dto.NetworkWeather
import uz.shark.weather.framework.util.BaseApiResponse
import uz.shark.weather.framework.util.NetworkResult
import javax.inject.Inject

class WeatherRepoImpl @Inject constructor(
    private val weatherDataSource: WeatherDataSource
) : WeatherRepo, BaseApiResponse() {
    override suspend fun getCurrentWeather(
        lat: String,
        lon: String
    ): Flow<NetworkResult<NetworkWeather>> {
        return flow {
            emit(safeApiCall { weatherDataSource.getCurrentWeather(lat, lon) })
        }.flowOn(Dispatchers.IO)
    }
}