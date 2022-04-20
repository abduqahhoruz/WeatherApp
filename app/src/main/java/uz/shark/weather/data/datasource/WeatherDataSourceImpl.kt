package uz.shark.weather.data.datasource

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import retrofit2.Response
import uz.shark.weather.data.WeatherApi
import uz.shark.weather.data.network.dto.NetworkWeather
import javax.inject.Inject


class WeatherDataSourceImpl @Inject constructor(
    @ApplicationContext private val context: Context,
    private val weatherApi: WeatherApi,
) : WeatherDataSource {
    override suspend fun getCurrentWeather(lat: String, lon: String): Response<NetworkWeather> {
        return weatherApi.getCurrentWeather(lat, lon)
    }
}