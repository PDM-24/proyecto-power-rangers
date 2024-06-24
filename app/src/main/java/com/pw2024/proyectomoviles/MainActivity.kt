package com.pw2024.proyectomoviles

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.pw2024.proyectomoviles.ui.home.HomeScreen
import com.pw2024.proyectomoviles.ui.home.HomeViewModel
import com.pw2024.proyectomoviles.ui.login.LoginScreen
import com.pw2024.proyectomoviles.ui.login.LoginViewModel
import com.pw2024.proyectomoviles.ui.theme.ProyectoMovilesTheme
import com.pw2024.proyectomoviles.util.Screen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProyectoMovilesTheme {
                val loginViewModel: LoginViewModel by viewModels()
                val homeViewModel: HomeViewModel by viewModels()
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = Screen.LoginScreen.route
                ) {
                    composable(Screen.LoginScreen.route) {
                        LoginScreen(loginViewModel)
                    }
                    composable(Screen.HomeScreen.route) {
                        HomeScreen(homeViewModel)
                    }
                }
            }
        }
    }
}