package uz.shark.weather.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uz.shark.weather.data.pref.WeatherPref
import uz.shark.weather.data.pref.WeatherPrefImpl

@Module
@InstallIn(SingletonComponent::class)
abstract class AppModuleBinds {

    @Binds
    abstract fun bindWeatherPref(weatherPrefImpl: WeatherPrefImpl): WeatherPref

}