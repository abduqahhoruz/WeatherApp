package uz.shark.weather

import dagger.hilt.android.AndroidEntryPoint
import uz.shark.weather.databinding.ActivityMainBinding
import uz.shark.weather.ui.base.BaseActivity

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {
    override fun setupItems() {

    }


}