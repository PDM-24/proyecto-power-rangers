package com.alexis.preproyecto.ui.screens.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun simplefun() {

    var selectedCategory by remember { mutableStateOf("") }
    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {


        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFDDC1C1), shape = CircleShape)
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Search by:", fontSize = 16.sp, modifier = Modifier.padding(end = 8.dp))

            var expanded by remember { mutableStateOf(false) }
            var selectedOption by remember { mutableStateOf("Category") }


            Spacer(modifier = Modifier.width(8.dp))

            TextField(
                value = "Text",
                onValueChange = {},
                modifier = Modifier
                    .weight(1f)
                    .background(Color.Transparent)
            )

            IconButton(onClick = { /* Acción de búsqueda */ }) {
                Icon(imageVector = Icons.Filled.Search, contentDescription = "Search")
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun preview(){
    simplefun()
}


