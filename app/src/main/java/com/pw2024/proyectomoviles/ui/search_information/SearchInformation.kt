package com.pw2024.proyectomoviles.ui.search_information

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.SearchBar
import androidx.compose.material3.SearchBarDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.pw2024.proyectomoviles.ui.theme.colorSearch

@Composable
fun SearchInformation() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        NavSearch()
        TextSearch()
        LazySearch()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun NavSearch() {
    var textSearch by remember { mutableStateOf("") }
    var textActive by remember { mutableStateOf(false) }
    Row {
        SearchBar(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            query = textSearch,
            onQueryChange = { textSearch = it},
            onSearch = { textActive = false },
            active = textActive,
            onActiveChange = {
                textActive = it
            },
            placeholder = {
                Text(text = "¿Qué estás buscando?")
            },
            leadingIcon = {
                Icon(imageVector = Icons.Default.Search,
                    contentDescription = "icon_search")
            },
            trailingIcon = {
                if(textActive) {
                    Icon(
                        modifier = Modifier
                            .clickable {
                                if(textSearch.isNotEmpty()) {
                                    textSearch = ""
                                }
                                else {
                                    textActive = false
                                }
                            },
                        imageVector = Icons.Default.Close,
                        contentDescription = "icon_close")
                }
            },
            colors = SearchBarDefaults.colors(colorSearch)
        ) {

        }
    }
}

@Composable
fun TextSearch() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp, 20.dp, 0.dp, 15.dp)
    ) {
        Text(text = "Resultados")
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LazySearch() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(5.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LazyColumn {
            //items() {
            //ElevatedCard(onClick = {

            //}) {

            //}
            //}
        }
    }
}