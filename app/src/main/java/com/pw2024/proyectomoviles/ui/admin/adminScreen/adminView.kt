package com.pw2024.proyectomoviles.ui.admin.adminScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.alexis.preproyecto.ui.screens.component.dropMenuSeach
import com.alexis.preproyecto.ui.screens.component.searchBar
import com.pw2024.proyectomoviles.data.dummy.bookListItem

import com.pw2024.proyectomoviles.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AdminView() {
    val primary: Color = colorResource(id = R.color.first)
    val secondary: Color = colorResource(id = R.color.unselected)
    val base: Color = colorResource(id = R.color.base)

    Column {
        Spacer(modifier = Modifier.size(30.dp))
        Text(
            text = "BookApp Admin view",
            modifier = Modifier
                .fillMaxWidth()
                .background(primary),
            fontSize = 30.sp,
            color = Color.White

        )
        Column(

            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Signed in as Christian Melgar", fontWeight = FontWeight.Bold, color = Color.Black)

            Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(
                        painter = painterResource(R.drawable.icon_reported_posts),
                        contentDescription = "Reported posts",
                        modifier = Modifier.size(24.dp),
                        tint  =  Color.Black
                    )
                    Text(text = "Reported posts", color = Color.Black)
                }

                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(
                        painter = painterResource(R.drawable.icon_reported_users),
                        contentDescription = "Reported users",
                        modifier = Modifier.size(24.dp),
                        tint  =  Color.Black
                    )
                    Text(text = "Reported users", color = Color.Black)
                }
            }
        }



       Row(modifier = Modifier
           .fillMaxWidth()
           .background(primary)
           .padding(5.dp)

        ){

            Text(text = "search by",modifier = Modifier
                .background(Color.White)
                .padding(5.dp) )
           dropMenuSeach()
           searchBar()



        }

        LazyColumn(
            modifier = Modifier
                .background(base)
                .padding(16.dp)
        ) {
            itemsIndexed(bookListItem) { index, bookItem ->

                Card(
                    modifier = Modifier
                        .background(base)
                        .padding(16.dp)
                        .fillMaxWidth(),
                    onClick = { /*TODO*/ }
                ) {
                    Row(
                        modifier = Modifier
                            .background(secondary)
                            .padding(16.dp)
                    ) {
                        Image(painter = painterResource(bookItem.imagen), contentDescription = bookItem.titulo, modifier = Modifier.height(130.dp))

                        Column {
                            Text(text = bookItem.titulo)
                            Text(text = "En Venta")
                        }
                    }

                }
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun Preview(){
    AdminView()
}


