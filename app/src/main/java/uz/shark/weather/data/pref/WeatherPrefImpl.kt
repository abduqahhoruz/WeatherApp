package uz.shark.weather.data.pref
import android.content.SharedPreferences
import javax.inject.Inject

class WeatherPrefImpl @Inject constructor(private val pref: SharedPreferences) : WeatherPref {
    override var isTemp: Boolean
        get() = pref.getBoolean(WeatherPref.IS_CELSIUM, true)
        set(value) {
            pref.edit().putBoolean(WeatherPref.IS_CELSIUM, value).apply()
        }
}