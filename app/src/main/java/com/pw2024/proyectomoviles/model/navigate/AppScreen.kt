package com.pw2024.proyectomoviles.model.navigate

sealed class AppScreen(val route: String) {
    data object Home: AppScreen("home")
    data object SearchInformation: AppScreen("search_information")
    data object NewPost: AppScreen("new_post")
    data object ProfileTwo: AppScreen("profile_two")
    data object LoginScreen: AppScreen("login")
    data object Register: AppScreen("register")
    data object Profile: AppScreen("profile")
    data object ForgotPassword: AppScreen("forgot_password")
    data object ChangePassword: AppScreen("change_password")
    data object CodePassword: AppScreen("code_password")
    data object Social: AppScreen("social")
    data object BookView: AppScreen("book_view")
    data object AdminView: AppScreen("admin_view")
    data object AdminViewReport: AppScreen("admin_report")
    data object AdminViewReportTwo: AppScreen("admin_report_two")
}
