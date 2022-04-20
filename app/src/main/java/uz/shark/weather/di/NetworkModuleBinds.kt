package uz.shark.weather.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uz.shark.weather.data.datasource.WeatherDataSource
import uz.shark.weather.data.datasource.WeatherDataSourceImpl
import uz.shark.weather.data.repo.WeatherRepo
import uz.shark.weather.data.repo.WeatherRepoImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class NetworkModuleBinds {

    @[Singleton Binds]
    abstract fun bindWeatherDataSource(weatherDataSourceImpl: WeatherDataSourceImpl): WeatherDataSource

    @[Singleton Binds]
    abstract fun bindWeatherRepo(weatherRepoImpl: WeatherRepoImpl): WeatherRepo
}