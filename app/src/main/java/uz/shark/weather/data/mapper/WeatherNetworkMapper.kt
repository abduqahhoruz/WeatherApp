package uz.shark.weather.data.mapper

import uz.shark.weather.data.network.dto.NetworkWeather
import uz.shark.weather.data.network.util.NetworkMapper
import uz.shark.weather.domain.WeatherLocal
import javax.inject.Inject

class WeatherNetworkMapper @Inject constructor() : NetworkMapper<NetworkWeather, WeatherLocal>() {
    override fun mapFromDto(dto: NetworkWeather): WeatherLocal {
        return WeatherLocal(
            dto.networkWeatherDescriptions[0].description ?: "",
            dto.networkWeatherDescriptions[0].icon ?: "",
            dto.networkWeatherCondition.temp,
            dto.name,
            dto.wind.speed,
            dto.networkWeatherCondition.humidity,
            dto.networkWeatherCondition.pressure
        )
    }


}