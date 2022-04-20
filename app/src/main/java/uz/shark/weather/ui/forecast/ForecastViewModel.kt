package uz.shark.weather.ui.forecast

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import uz.shark.weather.data.network.dto.NetworkWeather
import uz.shark.weather.data.repo.WeatherRepo
import uz.shark.weather.framework.util.NetworkResult
import javax.inject.Inject

@HiltViewModel
class ForecastViewModel @Inject constructor(
    private val repo: WeatherRepo
) : ViewModel() {

    private val _liveWeatherState = MutableLiveData<NetworkResult<NetworkWeather>>()
    val liveWeatherState: LiveData<NetworkResult<NetworkWeather>> = _liveWeatherState

    fun getCurrentWeather(lat: String, lon: String) {
        viewModelScope.launch(Dispatchers.IO) {
            _liveWeatherState.postValue(NetworkResult.Loading())
            repo.getCurrentWeather(lat, lon).collect {
                _liveWeatherState.postValue(it)
            }
        }
    }
}
