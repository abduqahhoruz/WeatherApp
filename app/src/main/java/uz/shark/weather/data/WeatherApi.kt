package uz.shark.weather.data

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import uz.shark.weather.data.NetworkConstants.GET_CURRENT_WEATHER
import uz.shark.weather.data.network.dto.NetworkWeather

interface WeatherApi {

    @GET(GET_CURRENT_WEATHER)
    suspend fun getCurrentWeather(
        @Query("lat") lat: String,
        @Query("lon") lon: String
    ): Response<NetworkWeather>

}