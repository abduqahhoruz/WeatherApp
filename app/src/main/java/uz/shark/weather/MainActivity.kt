package uz.shark.weather

import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import dagger.hilt.android.AndroidEntryPoint
import uz.shark.weather.databinding.ActivityMainBinding
import uz.shark.weather.ui.base.BaseActivity

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {
    override fun setupItems() {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment_activity_main) as? NavHostFragment
        if (navHostFragment != null) {
            navController = navHostFragment.navController
        }
        val bottomNavigation = binding.navView
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_forecast,
                R.id.navigation_search,
                R.id.navigation_favourites
            )
        )
        navController?.let { setupActionBarWithNavController(it, appBarConfiguration) }
        navController?.let { bottomNavigation.setupWithNavController(it) }

    }


}