package uz.shark.weather.data.mapper

import uz.shark.weather.cache.WeatherEntity
import uz.shark.weather.data.network.util.NetworkMapper
import uz.shark.weather.domain.WeatherLocal
import javax.inject.Inject

class WeatherCacheMapper @Inject constructor() : NetworkMapper<WeatherEntity, WeatherLocal>() {
    override fun mapFromDto(dto: WeatherEntity): WeatherLocal {
        return WeatherLocal(
            description = dto.description,
            icon = dto.icon,
            temp = dto.temp,
            cityName = dto.cityName,
            windSpeed = dto.windSpeed,
            humidity = dto.humidity,
            pressure = dto.pressure
        )
    }
}