package com.pw2024.proyectomoviles.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun HomeScreen(
    viewModel: HomeViewModel,
    navController: NavController
) {
    Scaffold {
        Column(
            modifier = Modifier
                .padding(paddingValues = it)
        ) {
            Text("Home Screen")
        }
    }
}