package com.pw2024.proyectomoviles.model.navigate

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.pw2024.proyectomoviles.ui.change_password.ChangePassword
import com.pw2024.proyectomoviles.ui.code_password.CodePassword
import com.pw2024.proyectomoviles.ui.forgot_password.ForgotPassword
import com.pw2024.proyectomoviles.ui.register.Register
import com.pw2024.proyectomoviles.ui.search_information.SearchInformation

@Composable
fun NavBarGraph(navController: NavHostController, innerPadding: PaddingValues) {
    NavHost(navController = navController, startDestination = AppScreen.Register.route) {
        composable(AppScreen.Register.route) {
            Register()
        }
        composable(AppScreen.SearchInformation.route) {
            SearchInformation()
        }
        composable(AppScreen.CodePassword.route) {
            CodePassword()
        }
        composable(AppScreen.ChangePassword.route) {
            ChangePassword()
        }
        composable(AppScreen.ForgotPassword.route) {
            ForgotPassword()
        }
    }
}