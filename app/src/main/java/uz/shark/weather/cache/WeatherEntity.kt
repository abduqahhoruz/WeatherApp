package uz.shark.weather.cache

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "weather")
data class WeatherEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "_id")
    val id: Long = 0L,

    @ColumnInfo(name = "description")
    val description: String = "",

    @ColumnInfo(name = "icon")
    val icon: String = "",

    @ColumnInfo(name = "temp")
val temp: Double = 0.0,

@ColumnInfo(name = "cityName")
val cityName: String = "",

@ColumnInfo(name = "windSpeed")
val windSpeed: Double = 0.0,

@ColumnInfo(name = "humidity")
val humidity: Double = 0.0,

@ColumnInfo(name = "pressure")
val pressure: Double = 0.0

)
