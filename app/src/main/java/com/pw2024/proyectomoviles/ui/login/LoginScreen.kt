package com.pw2024.proyectomoviles.ui.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pw2024.proyectomoviles.R


@Preview(showSystemUi = true)
@Composable
fun LoginScreen() {
    val email = remember {
        mutableStateOf("")
    }
    val password = remember {
        mutableStateOf("")
    }
    Scaffold {
        Column(
            modifier = Modifier
                .padding(it)
        ) {
            //Aurora's logo
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.5f),
                //.background(Color.Cyan),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_aurora),
                    contentDescription = "Aurora"
                )
            }
            //User input section
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth(),
                contentAlignment = Alignment.TopCenter
            ) {
                Column(
                    modifier =
                    Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Bienvenido",
                        style = TextStyle(
                            fontSize = 40.sp,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center,
                            letterSpacing = 5.sp
                        )
                    )
                    Spacer(modifier = Modifier.height(20.dp))
                    Text(
                        text = "Inicia sesion con tu cuenta",
                        style = TextStyle(
                            fontSize = 15.sp,
                            fontStyle = FontStyle.Italic,
                            textAlign = TextAlign.Center
                        )
                    )
                    Spacer(modifier = Modifier.height(30.dp))
                    OutlinedTextField(
                        value = email.value,
                        onValueChange = { email.value = it },
                        label = { Text(text = "Email") },
                        shape = RoundedCornerShape(30.dp),
                        modifier = Modifier
                            .width(300.dp)

                    )
                    OutlinedTextField(
                        value = password.value,
                        onValueChange = { password.value = it },
                        label = { Text(text = "Contrasenia") },
                        shape = RoundedCornerShape(30.dp),
                        visualTransformation = PasswordVisualTransformation(),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                        modifier = Modifier
                            .width(300.dp)
                    )
                    Spacer(modifier = Modifier.height(30.dp))
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .width(300.dp)
                    ) {
                        Text(text = "Iniciar Sesion")
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(text = "Olvidaste tu contrasenia?")
                }
            }
            //Screen footer
            Box(
                modifier = Modifier
                    .fillMaxWidth(),
                contentAlignment = Alignment.BottomCenter
            ) {
                Text(text = "No tienes cuenta? Crea una")
            }

        }
    }
}