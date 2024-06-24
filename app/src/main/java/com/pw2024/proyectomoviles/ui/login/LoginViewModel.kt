package com.pw2024.proyectomoviles.ui.login

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pw2024.proyectomoviles.data.remote.api.ApiClient
import com.pw2024.proyectomoviles.data.remote.request.LoginRequest
import com.pw2024.proyectomoviles.util.ErrorExtractor.Companion.extractErrorMessage
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import org.json.JSONException
import org.json.JSONObject
import retrofit2.HttpException

class LoginViewModel: ViewModel() {
    private val _loginState = MutableStateFlow(LoginState())
    val loginState = _loginState.asStateFlow()
    private val _eventFlow = MutableSharedFlow<UiEvent>()
    val eventFlow = _eventFlow.asSharedFlow()

    fun onEvent(event: LoginEvent) {
        when (event) {
            is LoginEvent.UpdatePassword -> {
                _loginState.value = loginState.value.copy(
                    password = event.updatedPassword
                )
            }
            is LoginEvent.UpdateUsername -> {
                _loginState.value = loginState.value.copy(
                    username = event.updatedUsername
                )
            }
            LoginEvent.Login -> {
                viewModelScope.launch {
                    val loginRequest = LoginRequest(
                        username = _loginState.value.username,
                        password = _loginState.value.password
                    )
                    sendLoginRequest(loginRequest)
                    _eventFlow.emit(
                        UiEvent.NavigateToHomeScreen
                    )
                }
            }
        }
    }

    private fun sendLoginRequest(loginRequest: LoginRequest) {
        viewModelScope.launch {
            try {
                var response = ApiClient.apiService.login(loginRequest)
            } catch (e: HttpException) {
                val errorMessage = extractErrorMessage(e)
                _eventFlow.emit(
                    UiEvent.ShowSnackbar(errorMessage ?: "Algo ha ocurrido...")
                )
            }
        }
    }


    sealed class UiEvent() {
        data class ShowSnackbar(val message: String): UiEvent()
        data object NavigateToHomeScreen: UiEvent()
    }
}