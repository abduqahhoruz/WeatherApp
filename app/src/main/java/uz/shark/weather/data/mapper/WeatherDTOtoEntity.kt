package uz.shark.weather.data.mapper

import uz.shark.weather.cache.WeatherEntity
import uz.shark.weather.data.network.dto.NetworkWeather
import uz.shark.weather.data.network.util.NetworkMapper
import javax.inject.Inject

class WeatherDTOtoEntity @Inject constructor() : NetworkMapper<NetworkWeather, WeatherEntity>() {
    override fun mapFromDto(dto: NetworkWeather): WeatherEntity {
        return WeatherEntity(
            description = dto.networkWeatherDescriptions[0].description ?: "",
            icon = dto.networkWeatherDescriptions[0].icon ?: "",
            temp = dto.networkWeatherCondition.temp,
            cityName = dto.name,
            windSpeed = dto.wind.speed,
            humidity = dto.networkWeatherCondition.humidity,
            pressure = dto.networkWeatherCondition.humidity
        )
    }
}