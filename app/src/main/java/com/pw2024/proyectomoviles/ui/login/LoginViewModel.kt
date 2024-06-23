package com.pw2024.proyectomoviles.ui.login

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class LoginViewModel: ViewModel() {
    private val _loginState = MutableStateFlow(LoginState())
    val loginState = _loginState.asStateFlow()

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
        }
    }
}