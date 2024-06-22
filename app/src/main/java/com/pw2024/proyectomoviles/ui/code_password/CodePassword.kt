package com.pw2024.proyectomoviles.ui.code_password

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.pw2024.proyectomoviles.R
import com.pw2024.proyectomoviles.ui.theme.colorButtonPassword

@Composable
fun CodePassword() {

    var textVerify by remember { mutableStateOf("") }
    var textNotVisible by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        //Imagen
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(0.dp, 100.dp, 0.dp),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.iconsecurity),
                contentDescription = "Icon from verify password",
                modifier = Modifier.size(250.dp)
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(text = "Ingresa el código de verificación")
        }

        val iconCheck = if (textNotVisible) {
            painterResource(id = R.drawable.baseline_visibility_24)
        }
        else {
            painterResource(id = R.drawable.baseline_visibility_off_24)
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            OutlinedTextField(
                value = textVerify,
                onValueChange = { textVerify = it },
                label = { Text(text = "Codigo") },
                trailingIcon = {
                    IconButton(
                        onClick = { textNotVisible = !textNotVisible }) {
                        Icon(
                            painter = iconCheck,
                            contentDescription = "Icon_visibility"
                        )
                    }
                },
                visualTransformation = if (textNotVisible) VisualTransformation.None
                else PasswordVisualTransformation()
            )
        }

        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Button(
                colors = ButtonDefaults.buttonColors(colorButtonPassword),
                onClick = {

                },
                enabled = if (textVerify.isEmpty()) false else true
            ) {
                Text(text = "Restablecer contraseña")
            }
        }
    }
}