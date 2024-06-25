package com.pw2024.proyectomoviles.ui.login

sealed class LoginEvent {
    data class UpdateUsername(val updatedUsername: String): LoginEvent()
    data class UpdatePassword(val updatedPassword: String): LoginEvent()
    data object Login: LoginEvent()
}