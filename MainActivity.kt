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
import androidx.compose.foundation.layout.width
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import com.example.laboratorio5.ui.theme.Laboratorio5Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratorio5Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    ComposeArticleApp()
                }
            }
        }
    }
}

@Composable
fun ComposeArticleApp() {
    ArticleCard(
        imagePainter = painterResource(R.drawable.bg_compose_background),
        title = "TOYOTA CENTER",
    )
}


@Composable
fun ArticleCard(
    imagePainter: Painter,
    title: String,
    modifier: Modifier = Modifier,
) {
    Column(modifier = modifier) {
        Text(
            text = title,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(16.dp),
            style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Bold),

            )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp) // Ajusta la altura según tus necesidades
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
            text = " VEHIULOS DESTACADOS",
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .align(Alignment.Start),
            style = TextStyle(fontSize =20.sp, fontWeight = FontWeight.Bold),
            color = Color.Gray // Cambia el color del texto según tus preferencias
        )

        // Dos imágenes a la par de la otra
        Row(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = painterResource(R.drawable.image1),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(140.dp)
                    .width(180.dp)
            )
            Image(
                painter = painterResource(R.drawable.image2),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(140.dp)
                    .width(180.dp)
            )
        }

        // Otro título con dos imágenes debajo
        Text(
            text = "SERVICIOS Y ACCESORIOS",
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .align(Alignment.Start),
            style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold),
            color = Color.Gray // Cambia el color del texto según tus preferencias
        )

        // Dos imágenes a la par de la otra
        Row(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = painterResource(R.drawable.image3),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(140.dp)
                    .width(180.dp)
            )
            Image(
                painter = painterResource(R.drawable.image4),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(140.dp)
                    .width(180.dp)
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
        ComposeArticleApp()
    }
}
*/