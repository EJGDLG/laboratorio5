package com.example.laboratorio5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import com.example.laboratorio5.ui.theme.Laboratorio5Theme


class myprofile: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratorio5Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    ComposeApp()
                }
            }
        }
    }



    @Composable
    fun ComposeApp() {
        Article(
            imagePainter = painterResource(R.drawable.image5),
            title = "My Profile",
            cardImages = listOf(painterResource(R.drawable.image_card1),
                painterResource(R.drawable.image_card2),
                painterResource(R.drawable.image_card3),
                painterResource(R.drawable.image_card4),
                painterResource(R.drawable.image_card5),
                painterResource(R.drawable.image_card6),
                painterResource(R.drawable.image_card7),

                )
        )
    }


    @Composable
    fun Article(
        cardImages: List<Painter>,
        imagePainter: Painter,
        title: String,
        modifier: Modifier = Modifier,
    ) {
        Column(modifier = modifier) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp), // Ajusta la altura según tus necesidades
                //horizontalArrangement = Arrangement.Center
                horizontalArrangement = Arrangement.End
            ) {
                Text(
                    text = "My profile",
                    modifier = Modifier.align(Alignment.CenterVertically),
                    style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold)
                )

                Image(
                    painter = painterResource(R.drawable.image_card8),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier

                        .height(150.dp)
                        .width(150.dp)

                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp),

                ) {

                Image(
                    painter = imagePainter,
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
            }

            // Título debajo de la imagen
            Text(
                text = "EDWIN JOSE GABRIEL DE LEON ",
                modifier = Modifier
                    .padding(20.dp)
                    .fillMaxWidth()
                    .align(Alignment.CenterHorizontally),
                style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold)
            )

            Image(
                painter = painterResource(R.drawable.image_card1),
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.Start)
                    .height(60.dp)
                    .width(200.dp)
            )

            Image(
                painter = painterResource(R.drawable.image_card2),
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.Start)
                    .height(50.dp)
                    .width(200.dp)
            )
            Image(
                painter = painterResource(R.drawable.image_card3),
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.Start)
                    .height(60.dp)
                    .width(210.dp)
            )

            Image(
                painter = painterResource(R.drawable.image_card4),
                contentDescription = null,
                modifier = Modifier
                    .height(60.dp)
                    .width(200.dp)
            )

            Image(
                painter = painterResource(R.drawable.image_card5),
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.Start)
                    .height(60.dp)
                    .width(200.dp)
            )

            Image(
                painter = painterResource(R.drawable.image_card6),
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.Start)
                    .height(60.dp)
                    .width(200.dp)
            )
            Image(
                painter = painterResource(R.drawable.image_card7),
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.Start)
                    .height(50.dp)
                    .width(260.dp)
            )

        }
    }
}


/*
@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun GreetingPreview() {
    Laboratorio5Theme {
        ComposeApp()
    }
}
*/