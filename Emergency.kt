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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.width
import androidx.compose.ui.Alignment
import com.example.laboratorio5.ui.theme.Laboratorio5Theme


class Emergency: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratorio5Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    ComposeEmergencyApp()
                }
            }
        }
    }
}
@Composable
fun ComposeEmergencyApp() {
    ArticleEmergency(
        imagePainter = painterResource(R.drawable.image5),
        title = "Emergency Contact",
        cardImages = listOf(
            painterResource(R.drawable.image_card10),
            painterResource(R.drawable.image_card12),
            painterResource(R.drawable.image_card13),
            painterResource(R.drawable.image_card14),
            painterResource(R.drawable.image_card15),

            )
    )
}

@Composable
fun ArticleEmergency(
    cardImages: List<Painter>,
    imagePainter: Painter,
    title: String,
    modifier: Modifier = Modifier,
) {
    Column(modifier = modifier) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(65.dp),
            horizontalArrangement = Arrangement.Start
        )
        {
            Image(
                painter = painterResource(R.drawable.image_card19),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .height(25.dp)
                    .width(100.dp)
            )
            Text(
                text = title,
                modifier = Modifier.align(Alignment.CenterVertically),
                style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold)
            )
        }
        Image(
            painter = painterResource(R.drawable.image_card17),
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .height(100.dp)
                .width(370.dp)
        )
        Image(
            painter = painterResource(R.drawable.image_card20),
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .height(70.dp)
                .width(370.dp)
        )
        Image(
            painter = painterResource(R.drawable.image_card18),
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.Start)
                .height(200.dp)
                .width(500.dp)
        )
        Image(
            painter = painterResource(R.drawable.image_card21),
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .height(70.dp)
                .width(370.dp)
        )
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
        ComposeEmergencyApp()
    }
}
*/


