package uz.shark.weather.data

object NetworkConstants {
    const val SEARCH_DEBOUNCE: Long = 500L
    const val NETWORK_TIMEOUT = 20000L
    /*data/2.5/weatherLocal?lat=41.309416&lon=69.223089&appid=b65a0ba2b507c02def4d6387ba497bf7*/
    const val GET_CURRENT_WEATHER = "data/2.5/weather?"
}
