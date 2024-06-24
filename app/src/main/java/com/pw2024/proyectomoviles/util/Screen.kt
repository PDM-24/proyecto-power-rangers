package com.pw2024.proyectomoviles.util

sealed class Screen(val route: String) {
    data object LoginScreen: Screen("login_screen")
    data object HomeScreen: Screen("home_screen")
    data object MyPosts: Screen("my_posts")
    data object Account: Screen("account")
    data object PostView: Screen("post_view")
}