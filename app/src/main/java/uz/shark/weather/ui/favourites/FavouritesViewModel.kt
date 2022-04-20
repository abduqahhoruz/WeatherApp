package uz.shark.weather.ui.favourites

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import uz.shark.weather.data.WeatherApi
import javax.inject.Inject

@HiltViewModel
class FavouritesViewModel @Inject constructor(private val api: WeatherApi) : ViewModel() {


}
