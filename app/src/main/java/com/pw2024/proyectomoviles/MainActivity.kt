package com.pw2024.proyectomoviles

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.pw2024.proyectomoviles.ui.account.AccountScreen
import com.pw2024.proyectomoviles.ui.home.HomeScreen
import com.pw2024.proyectomoviles.ui.home.HomeViewModel
import com.pw2024.proyectomoviles.ui.login.LoginScreen
import com.pw2024.proyectomoviles.ui.login.LoginViewModel
import com.pw2024.proyectomoviles.ui.my_posts.MyPostsScreen
import com.pw2024.proyectomoviles.ui.theme.ProyectoMovilesTheme
import com.pw2024.proyectomoviles.util.Screen
import com.pw2024.proyectomoviles.util.bottomNavItems
import com.pw2024.proyectomoviles.util.navbarlessRoutes

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProyectoMovilesTheme {
                var selectedItemIndex by rememberSaveable {
                    mutableStateOf(0)
                }
                //val loginViewModel: LoginViewModel by viewModels()
                val homeViewModel: HomeViewModel by viewModels()
                val loginViewModel: LoginViewModel by viewModels()
                val navController = rememberNavController()
                val currentRoute by navController.currentBackStackEntryFlow.collectAsState(initial = null)
                val showBottomBar = currentRoute?.destination?.route !in navbarlessRoutes
                Scaffold(
                    bottomBar = {
                        if(showBottomBar) {
                            NavigationBar {
                                bottomNavItems.forEachIndexed { index, bottomNavigationItem ->
                                    NavigationBarItem(
                                        selected = selectedItemIndex == index,
                                        onClick = {
                                            selectedItemIndex = index
                                            navController.navigate(bottomNavigationItem.route)
                                        },
                                        icon = {
                                            Icon(
                                                imageVector = if(index == selectedItemIndex) {
                                                    bottomNavigationItem.selectedIcon
                                                } else bottomNavigationItem.unselectedIcon,
                                                contentDescription = bottomNavigationItem.title
                                            )
                                        }
                                    )
                                }
                            }
                        }
                    }
                ) { paddingValues ->
                    NavHost(
                        navController = navController,
                        startDestination = Screen.LoginScreen.route,
                        modifier = Modifier
                            .padding(paddingValues)
                    ) {
                        composable(Screen.LoginScreen.route) {
                            LoginScreen(loginViewModel, navController)
                        }
                        composable(Screen.HomeScreen.route) {
                            HomeScreen(homeViewModel, navController)
                        }
                        composable(Screen.MyPosts.route) {
                            MyPostsScreen()
                        }
                        composable(Screen.Account.route) {
                            AccountScreen()
                        }
                    }
                }
            }
        }
    }
}