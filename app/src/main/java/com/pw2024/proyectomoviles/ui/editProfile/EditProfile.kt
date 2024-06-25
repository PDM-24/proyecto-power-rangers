import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.*

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5ECE6))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Edit Profile Text
        Text(
            text = "Edita tu perfil",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFD1C4E9), shape = RoundedCornerShape(8.dp))
                .padding(8.dp)
                .align(Alignment.CenterHorizontally)
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Profile Picture
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.LightGray, shape = CircleShape)
        )

        Spacer(modifier = Modifier.height(16.dp))

        // User Name
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Christian Melgar",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.width(8.dp))
            IconButton(onClick = { /* TODO: Edit name action */ }) {
                Icon(Icons.Default.Edit, contentDescription = "Edit Name")
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Editable Fields
        EditableField("Christian")
        EditableField("Melgar")
        EditableField("cmelgar@uca.edu.sv")

        Spacer(modifier = Modifier.height(16.dp))

        // Change Password Button
        Button(
            onClick = { /* TODO: Change password action */ },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Green)
        ) {
            Text(text = "Cambiar Contraseña")
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Logout Button
        Button(
            onClick = { /* TODO: Logout action */ },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Red)
        ) {
            Text(text = "Cerrar sesion")
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Social Media Icons
        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth()
        ) {
            SocialMediaIcon()
            SocialMediaIcon()
            SocialMediaIcon()
            SocialMediaIcon()
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Bottom Navigation Bar Placeholder
        BottomNavigationBar()
    }
}

@Composable
fun EditableField(text: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFD1C4E9), shape = RoundedCornerShape(8.dp))
            .padding(horizontal = 8.dp, vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = text, fontSize = 16.sp)
        Spacer(modifier = Modifier.weight(1f))
        IconButton(onClick = { /* TODO: Edit field action */ }) {
            Icon(Icons.Default.Edit, contentDescription = "Edit Field")
        }
    }
    Spacer(modifier = Modifier.height(8.dp))
}

@Composable
fun SocialMediaIcon() {
    Box(
        modifier = Modifier
            .size(40.dp)
            .background(Color.LightGray, shape = CircleShape)
    )
}

@Composable
fun BottomNavigationBar() {
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFD1C4E9), shape = RoundedCornerShape(8.dp))
            .padding(vertical = 8.dp)
    ) {
        IconButton(onClick = { /* TODO: Home action */ }) {
            Icon(painterResource(id = android.R.drawable.ic_menu_view), contentDescription = "Home")
        }
        IconButton(onClick = { /* TODO: Search action */ }) {
            Icon(painterResource(id = android.R.drawable.ic_menu_search), contentDescription = "Search")
        }
        IconButton(onClick = { /* TODO: Add action */ }) {
            Icon(painterResource(id = android.R.drawable.ic_input_add), contentDescription = "Add")
        }
        IconButton(onClick = { /* TODO: Profile action */ }) {
            Icon(painterResource(id = android.R.drawable.ic_menu_myplaces), contentDescription = "Profile")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview() {
    ProfileScreen()
}
