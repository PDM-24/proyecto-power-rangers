package com.pw2024.proyectomoviles.ui.my_posts

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun MyPostsScreen() {
    Scaffold {
        Column(
            modifier = Modifier
                .padding(paddingValues = it)
        ) {
            Text("Home Screen")
        }
    }
}