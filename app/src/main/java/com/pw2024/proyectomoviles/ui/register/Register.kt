package com.pw2024.proyectomoviles.ui.register

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pw2024.proyectomoviles.ui.component.TopBarRegister
import com.pw2024.proyectomoviles.ui.theme.backgroundProject
import com.pw2024.proyectomoviles.ui.theme.colorButtonRegister

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Register() {

    var firstname by remember { mutableStateOf("") }
    var secondName by remember { mutableStateOf("") }
    var userEmail by remember { mutableStateOf("") }
    var passwordUser by remember { mutableStateOf("") }

    Scaffold(
        topBar = {
            TopBarRegister()
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .padding(start = 14.dp),
                verticalAlignment = Alignment.CenterVertically

            ) {
                Text(
                    text = "Registro",
                    fontSize = 35.sp
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(backgroundProject)
            ) {
                Spacer(modifier = Modifier.height(40.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {

                    OutlinedTextField(
                        value = firstname,
                        onValueChange = {
                            firstname = it
                        },
                        placeholder = { Text(text = "Nombres") },
                        shape = RoundedCornerShape(12.dp),
                        colors = TextFieldDefaults.colors(Color.Black)
                    )
                }
                Spacer(modifier = Modifier.height(20.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    OutlinedTextField(
                        value = secondName,
                        onValueChange = {
                            secondName = it
                        },
                        placeholder = { Text(text = "Apellidos") },
                        shape = RoundedCornerShape(12.dp),
                        colors = TextFieldDefaults.colors(Color.Black)
                    )
                }
                Spacer(modifier = Modifier.height(20.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    OutlinedTextField(
                        value = userEmail,
                        onValueChange = {
                            userEmail = it
                        },
                        placeholder = { Text(text = "Email") },
                        shape = RoundedCornerShape(12.dp),
                        colors = TextFieldDefaults.colors(Color.Black)
                    )
                }
                Spacer(modifier = Modifier.height(20.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    OutlinedTextField(
                        value = passwordUser,
                        onValueChange = {
                            passwordUser = it
                        },
                        placeholder = { Text(text = "Contraseña") },
                        shape = RoundedCornerShape(12.dp),
                        colors = TextFieldDefaults.colors(Color.Black)
                    )
                }
                Spacer(modifier = Modifier.height(20.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Button(
                        colors = ButtonDefaults.buttonColors(colorButtonRegister),
                        onClick = {

                        },
                        enabled = if (
                            (firstname.isEmpty()) or
                            (secondName.isEmpty()) or
                            (userEmail.isEmpty()) or
                            (passwordUser.isEmpty()))
                            false else true
                    ) {
                        Text(text = "Registrarse", color = Color.Black)
                    }
                }
            }
        }
    }
}