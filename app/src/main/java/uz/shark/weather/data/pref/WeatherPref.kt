package uz.shark.weather.data.pref

interface WeatherPref {
    var isTemp: Boolean
companion object{
    const val PREF_NAME = "weatherLocal"
    const val IS_CELSIUM = "is_celsium"
}
}