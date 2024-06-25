package com.pw2024.proyectomoviles.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.pw2024.proyectomoviles.ui.home.components.PostCard

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
            PostCard(
                "Lorem Ipsum",
                "200",
                "https://res.cloudinary.com/dmjhkm8qw/image/upload/v1718857856/aurora/jdzukzrhafzrcsrfyvdq.png",
                onCheckClick = {}
            )
        }
    }
}