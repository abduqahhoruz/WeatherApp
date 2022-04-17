package uz.shark.weather.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavDirections
import androidx.navigation.Navigator
import androidx.viewbinding.ViewBinding
import uz.shark.weather.MainActivity


typealias Inflate<T> = (LayoutInflater, ViewGroup?, Boolean) -> T

abstract class BaseFragment<VB : ViewBinding>(
    private val inflate: Inflate<VB>
) : Fragment() {

    private var _binding: VB? = null
    val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = inflate.invoke(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewCreated()
    }

    protected abstract fun viewCreated()
    fun navigate(navDirections: NavDirections, extras: Navigator.Extras? = null) {
        (activity as? MainActivity)?.navController?.let { navController ->
            navController.currentDestination?.getAction(navDirections.actionId)
                ?.let {
                    extras?.let { extras -> navController.navigate(navDirections, extras) }
                        ?: navController.navigate(navDirections)
                }

        }
    }

    fun getBaseActivity(run: (BaseActivity<*>) -> Unit) {
        (activity as? BaseActivity<*>)?.let {
            run(it)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}