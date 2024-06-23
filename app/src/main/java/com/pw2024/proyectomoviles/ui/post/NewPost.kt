package com.proyecto.vista

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.TextStyle



@Composable
fun NewPost () {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)
    ){
        var title by remember { mutableStateOf("") }
        var genre by remember { mutableStateOf("") }
        var author by remember { mutableStateOf("") }
        var synopsis by remember { mutableStateOf("") }
        var state by remember { mutableStateOf("") }
        var year by remember { mutableStateOf("") }
        var pages by remember { mutableStateOf("") }
        var isbn by remember { mutableStateOf("") }
        var editorial by remember { mutableStateOf("") }
        var language by remember { mutableStateOf("") }
        var price by remember { mutableStateOf("") }
        var forSale by remember { mutableStateOf(true) }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color (0xFFFEFBF6))
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Nueva publicación", style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold), color = Color(0xFFB29BA0))

            Spacer(modifier = Modifier.height(16.dp))

            OutlinedTextField(
                value = title,
                onValueChange = { title = it },
                label = { Text("Título del libro") },
                modifier = Modifier.fillMaxWidth(),
                colors = TextFieldDefaults.colors(
                    focusedPlaceholderColor = Color(0xFF9A8C98),
                    focusedContainerColor = Color(0xFF9A8C98),
                    unfocusedContainerColor =  Color(0xFF9A8C98),
                    unfocusedLabelColor = Color.White,
                    focusedTextColor = Color.White
                )

            )

            Spacer(modifier = Modifier.height(8.dp))

            Row(modifier = Modifier.fillMaxWidth()) {
                OutlinedTextField(
                    value = genre,
                    onValueChange = { genre = it },
                    label = { Text("Género") },
                    modifier = Modifier.weight(1f),
                    colors = TextFieldDefaults.colors(
                        focusedPlaceholderColor = Color(0xFF9A8C98),
                        focusedContainerColor = Color(0xFF9A8C98),
                        unfocusedContainerColor =  Color(0xFF9A8C98),
                        unfocusedLabelColor = Color.White,
                        focusedTextColor = Color.White
                    )
                    )
                Spacer(modifier = Modifier.width(8.dp))
                OutlinedTextField(
                    value = author,
                    onValueChange = { author = it },
                    label = { Text("Autor") },
                    modifier = Modifier.weight(1f),
                    colors = TextFieldDefaults.colors(
                        focusedPlaceholderColor = Color(0xFF9A8C98),
                        focusedContainerColor = Color(0xFF9A8C98),
                        unfocusedContainerColor =  Color(0xFF9A8C98),
                        unfocusedLabelColor = Color.White,
                        focusedTextColor = Color.White
                    )
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            OutlinedTextField(
                value = synopsis,
                onValueChange = { synopsis = it },
                label = { Text("Sinopsis") },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp),
                colors = TextFieldDefaults.colors(
                    focusedPlaceholderColor = Color(0xFF9A8C98),
                    focusedContainerColor = Color(0xFF9A8C98),
                    unfocusedContainerColor =  Color(0xFF9A8C98),
                    unfocusedLabelColor = Color.White,
                    focusedTextColor = Color.White
                )
            )

            Spacer(modifier = Modifier.height(8.dp))

            Row(modifier = Modifier.fillMaxWidth()) {
                OutlinedTextField(
                    value = state,
                    onValueChange = { state = it },
                    label = { Text("Estado") },
                    modifier = Modifier.weight(1f),
                    colors = TextFieldDefaults.colors(
                        focusedPlaceholderColor = Color(0xFF9A8C98),
                        focusedContainerColor = Color(0xFF9A8C98),
                        unfocusedContainerColor =  Color(0xFF9A8C98),
                        unfocusedLabelColor = Color.White,
                        focusedTextColor = Color.White
                    )
                )
                Spacer(modifier = Modifier.width(8.dp))
                OutlinedTextField(
                    value = year,
                    onValueChange = { year = it },
                    label = { Text("Año") },
                    modifier = Modifier.weight(1f),
                    colors = TextFieldDefaults.colors(
                        focusedPlaceholderColor = Color(0xFF9A8C98),
                        focusedContainerColor = Color(0xFF9A8C98),
                        unfocusedContainerColor =  Color(0xFF9A8C98),
                        unfocusedLabelColor = Color.White,
                        focusedTextColor = Color.White
                    )
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            Row(modifier = Modifier.fillMaxWidth()) {
                OutlinedTextField(
                    value = pages,
                    onValueChange = { pages = it },
                    label = { Text("# páginas") },
                    modifier = Modifier.weight(1f),
                    colors = TextFieldDefaults.colors(
                        focusedPlaceholderColor = Color(0xFF9A8C98),
                        focusedContainerColor = Color(0xFF9A8C98),
                        unfocusedContainerColor =  Color(0xFF9A8C98),
                        unfocusedLabelColor = Color.White,
                        focusedTextColor = Color.White
                    )
                )
                Spacer(modifier = Modifier.width(8.dp))
                OutlinedTextField(
                    value = isbn,
                    onValueChange = { isbn = it },
                    label = { Text("ISBN") },
                    modifier = Modifier.weight(1f),
                    colors = TextFieldDefaults.colors(
                        focusedPlaceholderColor = Color(0xFF9A8C98),
                        focusedContainerColor = Color(0xFF9A8C98),
                        unfocusedContainerColor =  Color(0xFF9A8C98),
                        unfocusedLabelColor = Color.White,
                        focusedTextColor = Color.White
                    )
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            Row(modifier = Modifier.fillMaxWidth()) {
                OutlinedTextField(
                    value = editorial,
                    onValueChange= { editorial = it },
                    label = { Text("Editorial") },
                    modifier = Modifier.weight(1f),
                    colors = TextFieldDefaults.colors(
                        focusedPlaceholderColor = Color(0xFF9A8C98),
                        focusedContainerColor = Color(0xFF9A8C98),
                        unfocusedContainerColor =  Color(0xFF9A8C98),
                        unfocusedLabelColor = Color.White,
                        focusedTextColor = Color.White
                    )
                )
                Spacer(modifier = Modifier.width(8.dp))
                OutlinedTextField(
                    value = language,
                    onValueChange = { language = it },
                    label = { Text("Idioma") },
                    modifier = Modifier.weight(1f),
                    colors = TextFieldDefaults.colors(
                        focusedPlaceholderColor = Color(0xFF9A8C98),
                        focusedContainerColor = Color(0xFF9A8C98),
                        unfocusedContainerColor =  Color(0xFF9A8C98),
                        unfocusedLabelColor = Color.White,
                        focusedTextColor = Color.White
                    )
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            Row(modifier = Modifier.fillMaxWidth()) {
                OutlinedTextField(
                    value = price,
                    onValueChange = { price = it },
                    label = { Text("Precio") },
                    modifier = Modifier.weight(1f),
                    colors = TextFieldDefaults.colors(
                        focusedPlaceholderColor = Color(0xFF9A8C98),
                        focusedContainerColor = Color(0xFF9A8C98),
                        unfocusedContainerColor =  Color(0xFF9A8C98),
                        unfocusedLabelColor = Color.White,
                        focusedTextColor = Color.White
                    )

                )
                Spacer(modifier = Modifier.width(8.dp))
                Column(
                    modifier = Modifier.weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        RadioButton(
                            selected = forSale,
                            onClick = { forSale = true },
                            colors = RadioButtonDefaults.colors(
                                selectedColor = Color(0xFF9A8C98),
                                unselectedColor = Color(0xFF9A8C98)
                            )
                        )
                        Text(text = "Venta", color = Color(0xFFB29BA0))
                    }
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        RadioButton(
                            selected = !forSale,
                            onClick = { forSale = false },
                            colors = RadioButtonDefaults.colors(
                                selectedColor = Color(0xFF9A8C98),
                                unselectedColor = Color(0xFF9A8C98)
                            )
                        )
                        Text(text = "Intercambio", color = Color(0xFF9A8C98))
                    }
                }
            }

            Spacer(modifier = Modifier.height(8.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(75.dp)
                    .background(Color(0xFF9A8C98)),
                contentAlignment = Alignment.Center
            ) {
                IconButton(onClick = { /* Agregar imagen */ }) {
                    Icon(Icons.Default.Add, contentDescription = "Agregar imagen", tint = Color.White)
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick = { /* Publicar */ },
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors( Color(0xFFB29BA0))
            ) {
                Text(text = "Publicar", color = Color.White)
            }
        }
    }
    }


@Preview
@Composable
fun NewPostPrev(){
    NewPost()
}