package com.pw2024.proyectomoviles

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.pw2024.proyectomoviles.ui.login.LoginScreen
import com.pw2024.proyectomoviles.ui.login.LoginViewModel
import com.pw2024.proyectomoviles.ui.theme.ProyectoMovilesTheme

class MainActivity : ComponentActivity() {
    val viewModel = LoginViewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProyectoMovilesTheme {
                LoginScreen(viewModel)
            }
        }
    }
}