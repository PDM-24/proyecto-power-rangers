package com.pw2024.proyectomoviles.ui.change_password

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.pw2024.proyectomoviles.R
import com.pw2024.proyectomoviles.model.navigate.AppScreen
import com.pw2024.proyectomoviles.ui.theme.colorButtonPassword

@Composable
fun ChangePassword() {

    var newPassword by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(0.dp, 100.dp, 0.dp),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.iconsecurity),
                contentDescription = "icon security change password",
                modifier = Modifier.size(250.dp)
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Nueva Constraseña",
                fontSize = 20.sp
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(0.dp, 15.dp, 0.dp),
            horizontalArrangement = Arrangement.Center
        ) {

            var textNotVisible by remember { mutableStateOf(false) }

            val iconCheck = if (textNotVisible) {
                painterResource(id = R.drawable.baseline_visibility_24)
            } else {
                painterResource(id = R.drawable.baseline_visibility_off_24)
            }

            OutlinedTextField(
                value = newPassword,
                onValueChange = { newPassword = it },
                label = { Text(text = "Ingrese contraseña") },
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
                .fillMaxWidth()
                .padding(0.dp, 15.dp, 0.dp),
            horizontalArrangement = Arrangement.Center
        ) {

            var textNotVisible by remember { mutableStateOf(false) }

            val iconCheck = if (textNotVisible) {
                painterResource(id = R.drawable.baseline_visibility_24)
            } else {
                painterResource(id = R.drawable.baseline_visibility_off_24)
            }

            OutlinedTextField(
                value = confirmPassword,
                onValueChange = { confirmPassword = it },
                label = { Text(text = "Confirmar contraseña") },
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
                .fillMaxWidth()
                .padding(0.dp, 15.dp, 0.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Button(
                colors = ButtonDefaults.buttonColors(colorButtonPassword),
                onClick = { },
                enabled = if (
                    (confirmPassword.isEmpty()) or
                    (newPassword.isEmpty()))
                    false else true
            )
            {
                Text(
                    text = "Restablecer contraseña",
                    modifier = Modifier.width(220.dp),
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}