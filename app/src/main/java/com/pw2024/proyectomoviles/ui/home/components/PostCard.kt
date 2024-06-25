package com.pw2024.proyectomoviles.ui.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage

//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun PostCard(
//    navigateToPostView: () -> Unit
//) {
//    ElevatedCard(
//        onClick = { navigateToPostView() },
//        modifier = Modifier
//            .padding(30.dp)
//            .fillMaxWidth()
//            .height(100.dp)
//    ) {
//        Row(
//            modifier = Modifier
//                .background(Color.Cyan)
//        ) {
//            AsyncImage(
//                model = "https://res.cloudinary.com/dmjhkm8qw/image/upload/v1718857856/aurora/jdzukzrhafzrcsrfyvdq.png",
//                contentDescription = "Test",
//                modifier = Modifier
//                    .weight(1f)
//                    .fillMaxHeight()
//            )
//            Text(text = "LOL", modifier = Modifier.weight(2f))
//        }
//    }
//}

@Composable
fun PostCard(
    title: String,
    price: String,
    imageUrl: String,
    onCheckClick: () -> Unit
) {
    Card(
        shape = RoundedCornerShape(16.dp),
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .wrapContentHeight(),
        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        Row(
            modifier = Modifier
                .background(Color(0xFFFFF0F0))
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            AsyncImage(
                model = imageUrl,
                contentDescription = "Book Image",
                modifier = Modifier
                    .size(100.dp)
                    .background(Color(0xFFFFE0E0), shape = RoundedCornerShape(16.dp)),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = title,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    color = Color.Black
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "Price: $price",
                    fontSize = 16.sp,
                    color = Color.Black
                )
                Spacer(modifier = Modifier.height(8.dp))
                Button(
                    onClick = onCheckClick,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Gray
                    )
                ) {
                    Text(text = "Check it out")
                }
            }
        }
    }
}


@Composable
@Preview(showSystemUi = true)
fun PostCardPreview() {
    PostCard(
        "Lorem Ipsum",
        "200",
        "https://res.cloudinary.com/dmjhkm8qw/image/upload/v1718857856/aurora/jdzukzrhafzrcsrfyvdq.png",
        onCheckClick = {}
    )
}