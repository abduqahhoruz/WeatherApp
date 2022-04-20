package uz.shark.weather.data.network.util

import android.content.Context
import uz.shark.weather.R


enum class Errors(val code: Int) {
    NO_CONNECTION(-3),
    SERVER_ERROR(-2),
    EMPTY_DATA(-1),

    UNAUTHORIZED(401),
    UNKNOWN_ERROR(55000),
    ALREADY_EXIST(412),
    NETWORK_TIMEOUT_ERROR(408);

    companion object {
        val Int?.error
            get() = values().find { it.code == this } ?: UNKNOWN_ERROR

        fun Errors?.message(context: Context): String? =
            this?.let { context.resources.getStringArray(R.array.errors)[ordinal] }
    }
}