package com.proyecto.vista

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BookView() {
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
            .background(Color(0xFF9A8C98))

    ) {
        Spacer(modifier = Modifier.height(16.dp))
        Column (modifier = Modifier
            .weight(0.3f)
            .fillMaxWidth() ){
            //falta imagen
        }

        Column(modifier = Modifier
            .weight(0.7f)
            .fillMaxWidth()
            .background(Color(0xFFFEFBF6))) {
            Spacer(modifier = Modifier.height(16.dp))
            Column(modifier = Modifier .padding(16.dp)) {
            Text(text = "Titulo:", fontSize = 24.sp, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "Género:", fontSize = 18.sp, fontWeight = FontWeight.SemiBold)
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "Sinopsis", fontSize = 18.sp, fontWeight = FontWeight.SemiBold)
            Text(text = "", fontSize = 16.sp)
            Text(text = "Detalles", fontSize = 18.sp, fontWeight = FontWeight.SemiBold)
            Text(text = "", fontSize = 16.sp)
            Text(text = "Estado:", fontSize = 16.sp)
            Text(text = "Año:", fontSize = 16.sp)
            Text(text = "ISBN: ", fontSize = 16.sp)
            Text(text = "Páginas: ", fontSize = 16.sp)
            Text(text = "Idioma: ", fontSize = 16.sp)
            Text(text = "Editorial: ", fontSize = 16.sp)
            Text(text = "Tipo de transacción: ", fontSize = 16.sp)
        }
    }
}
    }

@Preview
@Composable
fun BookViewPrev(){
    BookView()
}