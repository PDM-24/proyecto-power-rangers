package com.pw2024.proyectomoviles.ui.home.components

import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.AsyncImage

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PostCard(
    navigateToPostView: () -> Unit
) {
    ElevatedCard(onClick = { navigateToPostView() }) {
        AsyncImage(
            model = "https://res.cloudinary.com/dmjhkm8qw/image/upload/v1718857856/aurora/j…",
            contentDescription = "Test"
        )
    }
}

@Composable
@Preview(showSystemUi = true)
fun PostCardPreview() {
    PostCard(
        navigateToPostView = {

        }
    )
}