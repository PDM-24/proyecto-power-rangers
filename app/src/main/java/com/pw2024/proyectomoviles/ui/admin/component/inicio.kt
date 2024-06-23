package com.alexis.preproyecto.ui.screens.component

import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.pw2024.proyectomoviles.ui.navigation.navigationComponent.bottomNavItem
import com.pw2024.proyectomoviles.ui.navigation.navigationComponent.top


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavBar(

){

    var selected by remember { mutableIntStateOf(0) }


    Scaffold(

        topBar = {
            top()
        },

        bottomBar = {
            NavigationBar {

                bottomNavItem.forEachIndexed{ index, bottomNavItem ->
                    NavigationBarItem(


                        selected = index == selected ,
                        onClick = {
                            selected = index
                            //navController.navegate(bottomNavItem.route)
                        },
                        icon = {
                            BadgedBox(
                                badge = {
                                    if(bottomNavItem.badges != 0 ){
                                        Badge{
                                            Text(text = bottomNavItem.badges.toString())
                                        }
                                    } else if (bottomNavItem.hasNews){
                                        Badge()
                                    }
                                } ) {
                                Icon(
                                    imageVector =
                                    if(index == selected)
                                        bottomNavItem.selectedIcon
                                    else
                                        bottomNavItem.unselectedIcon,

                                    contentDescription = bottomNavItem.title
                                )
                            }
                        },
                        //texto
                        label = {
                            Text(text = bottomNavItem.title)
                        },



//C9ADA7

                    )
                }
            }
        }
        
    ) {

        val padding = it
        //contenido
    }
}





