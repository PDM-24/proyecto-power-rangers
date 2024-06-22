package com.pw2024.proyectomoviles

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.getValue
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.pw2024.proyectomoviles.model.navigate.BottomNavigation
import com.pw2024.proyectomoviles.model.navigate.NavBarGraph
import com.pw2024.proyectomoviles.model.navigate.NavBarItemList
import com.pw2024.proyectomoviles.ui.register.Register
import com.pw2024.proyectomoviles.ui.theme.ProyectoMovilesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProyectoMovilesTheme {

                val navController = rememberNavController()
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentRoute: String? = navBackStackEntry?.destination?.route
                val navItems = NavBarItemList()

                Scaffold(
                    bottomBar = {
                        BottomNavigation(items = navItems, currentRoute = currentRoute) {
                                currentNavigationItem ->
                            navController.navigate(currentNavigationItem.route){
                                navController.graph.startDestinationRoute?.let{startDestinationRoute ->
                                    popUpTo(startDestinationRoute){
                                        saveState = true
                                    }
                                }
                                launchSingleTop=true
                                restoreState = true
                            }
                        }
                    }
                ) { paddingValues ->
                    NavBarGraph(navController = navController, innerPadding = paddingValues)
                }
            }
        }
    }
}