package com.pw2024.proyectomoviles.util

sealed class Screen(val route: String) {
    data object HomeScreen: Screen("home_screen")
    data object LoginScreen: Screen("login_screen")
}