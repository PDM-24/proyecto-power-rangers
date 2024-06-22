package com.pw2024.proyectomoviles.ui.forgot_password

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pw2024.proyectomoviles.ui.component.TopBarForgotPassword

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ForgotPassword() {

    var emailText by remember { mutableStateOf("") }

    Scaffold(
        topBar = { TopBarForgotPassword() }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
        ) {
            Spacer(modifier = Modifier.height(20.dp))
            //Titulo
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "¿Olvidaste tu contraseña?", fontSize = 20.sp)
            }
            //Subtitulo
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp)
            ) {
                Text(text = "Se enviará un correo electrónico con un código de verificación a",
                    fontSize = 15.sp, textAlign = TextAlign.Center)
            }
            //Ingresar email
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .padding(0.dp, 20.dp, 0.dp),
                horizontalArrangement = Arrangement.Center
            ) {

                OutlinedTextField(
                    value = emailText,
                    onValueChange = {
                        emailText = it
                    },
                    label = { Text(text = "Ingrese su correo") },
                    shape = RoundedCornerShape(12.dp)
                )
            }
            //Botones
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(0.dp, 60.dp, 0.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(
                    colors = ButtonDefaults.buttonColors(Color.Green),
                    onClick = {

                    }) {
                    Text(text = "Enviar", modifier = Modifier.width(200.dp),
                        textAlign = TextAlign.Center)
                }
                Button(
                    colors = ButtonDefaults.buttonColors(Color.Red),
                    onClick = {

                    }) {
                    Text(text = "Cancelar", modifier = Modifier.width(200.dp),
                        textAlign = TextAlign.Center)
                }
            }
        }
    }
}