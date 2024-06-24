package com.pw2024.proyectomoviles.ui.login

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pw2024.proyectomoviles.data.remote.api.ApiClient
import com.pw2024.proyectomoviles.data.remote.request.LoginRequest
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class LoginViewModel: ViewModel() {
    private val _loginState = MutableStateFlow(LoginState())
    val loginState = _loginState.asStateFlow()
    private val _eventFlow = MutableSharedFlow<UiEvent>()
    val

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
                val loginRequest = LoginRequest(
                    username = _loginState.value.username,
                    password = _loginState.value.password
                )
                sendLoginRequest(loginRequest)
            }
        }
    }

    private fun sendLoginRequest(loginRequest: LoginRequest) {
        viewModelScope.launch {
            val response = ApiClient.apiService.login(loginRequest)
            Log.d("token", response.accessToken)
        }
    }

    sealed class UiEvent() {
        data class ShowSnackbar(val message: String): UiEvent()
    }
}