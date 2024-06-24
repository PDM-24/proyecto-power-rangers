package com.pw2024.proyectomoviles.model.navigate

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import com.pw2024.proyectomoviles.R

@Composable
fun NavBarItemList(): List<NavBarItem> {
    return listOf(
        NavBarItem(
            AppScreen.LoginScreen.route,
            ImageVector.vectorResource(id = R.drawable.baseline_home_24)
        ),
        NavBarItem(
            AppScreen.SearchInformation.route,
            ImageVector.vectorResource(id = R.drawable.baseline_search_24)
        ),
        NavBarItem(
            AppScreen.NewPost.route,
            ImageVector.vectorResource(id = R.drawable.baseline_add_24)
        ),
        NavBarItem(
            AppScreen.ChangePassword.route,
            ImageVector.vectorResource(id = R.drawable.baseline_person_24)
        )
    )
}