package uz.shark.weather.ui.forecast

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.viewModels
import com.bumptech.glide.RequestManager
import dagger.hilt.android.AndroidEntryPoint
import uz.shark.weather.data.Constants.URL_PIC
import uz.shark.weather.data.network.dto.NetworkWeather
import uz.shark.weather.databinding.FragmentForecastBinding
import uz.shark.weather.framework.util.NetworkResult
import uz.shark.weather.ui.base.BaseFragment
import javax.inject.Inject

@AndroidEntryPoint
class ForecastFragment : BaseFragment<FragmentForecastBinding>(FragmentForecastBinding::inflate) {
    private val viewModel: ForecastViewModel by viewModels()

    @Inject
    lateinit var manager: RequestManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.getCurrentWeather("41.309416", "69.223089")
    }

    override fun viewCreated() {
        viewModel.liveWeatherState.observe(viewLifecycleOwner) {
            when (it) {
                is NetworkResult.Success -> {
                    setUpUI(it.data!!)
                }
                is NetworkResult.Loading -> {
                }
                is NetworkResult.Error -> {
                }
            }
        }
    }

    @SuppressLint("CheckResult")
    private fun setUpUI(data: NetworkWeather) {
        binding.apply {
            pressureText.text = data.networkWeatherCondition.pressure.toString()
            windSpeedText.text = data.wind.speed.toString()
            weatherInText.text = data.name
            humidityText.text = data.networkWeatherCondition.humidity.toString()
            weatherTemperature.text = data.networkWeatherCondition.temp.toString()
            weatherMain.text = data.networkWeatherDescriptions[0].description
            manager.load(URL_PIC + "${data.networkWeatherDescriptions[0].icon}@2x.png")
                .centerCrop()
                .into(weatherIcon)

        }
    }

}


