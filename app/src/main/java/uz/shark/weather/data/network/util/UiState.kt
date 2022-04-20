package uz.shark.weather.data.network.util

sealed class UiState<T>(val data: T?, val error: Errors? = null) {
    class Success<T>(data: T?) : UiState<T>(data = data)
    class Error<T>(error: Errors) : UiState<T>(null, error = error)
    class Loading<T> : UiState<T>(data = null)
}