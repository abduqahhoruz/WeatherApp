package uz.instat.tmdb.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import uz.shark.weather.cache.WeatherDataBase
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Singleton
    @Provides
    fun provideDataBase(
        @ApplicationContext context: Context
    ): WeatherDataBase {
        return Room.databaseBuilder(context, WeatherDataBase::class.java, "weather")
            .fallbackToDestructiveMigration()
            .allowMainThreadQueries()
            .build()
    }
}

