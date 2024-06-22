package com.pw2024.proyectomoviles.model.navigate

import androidx.compose.foundation.background
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.pw2024.proyectomoviles.ui.theme.backgroundProject

@Composable
fun BottomNavigation(items: List<NavBarItem>, currentRoute: String?, onClick: (NavBarItem) -> Unit) {
    BottomAppBar() {
        NavigationBar(contentColor = MaterialTheme.colorScheme.primaryContainer) {
            items.forEach { it ->
                NavigationBarItem(
                    selected = currentRoute == it.route,
                    onClick = {onClick(it)},
                    icon = {
                        Icon(
                            imageVector = if (currentRoute == it.route){
                                it.icon
                            } else {
                                it.icon
                            },
                            contentDescription = "icon",
                        )
                    }
                )
            }
        }
    }
}