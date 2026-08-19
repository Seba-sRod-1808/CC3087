package plat.lab1.sebastian.lab4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White
                ) {
                    PortadaUVG()
                }
            }
        }
    }
}

@Composable
fun PortadaUVG() {

    val verdeUVG = Color(0xFF0B6623)

    Box(
        modifier = Modifier
            .fillMaxSize()
            .border(
                width = 7.dp,
                color = verdeUVG
            )
            .padding(30.dp)
    ) {

        Image(
            painter = painterResource(id = R.drawable.uvg_logo),
            contentDescription = "Escudo UVG",
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .size(380.dp)
                .align(Alignment.Center)
                .alpha(0.10f)
        )

        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(modifier = Modifier.height(180.dp))

            Text(
                text = "Universidad del Valle\nde Guatemala",
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                lineHeight = 43.sp
            )

            Spacer(modifier = Modifier.height(50.dp))

            Text(
                text = "Programación de plataformas\nmóviles, Sección 30",
                fontSize = 27.sp,
                textAlign = TextAlign.Center,
                lineHeight = 35.sp
            )

            Spacer(modifier = Modifier.height(45.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.Top
            ) {

                Text(
                    text = "INTEGRANTES",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )

                Column(
                    horizontalAlignment = Alignment.End
                ) {
                    Text(
                        text = "Mauricio Corado",
                        fontSize = 19.sp
                    )

                    Text(
                        text = "Fabricio Estrada",
                        fontSize = 19.sp
                    )

                    Text(
                        text = "Sebastian Rodas",
                        fontSize = 19.sp
                    )
                }
            }

            Spacer(modifier = Modifier.height(40.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {

                Text(
                    text = "CATEDRÁTICO",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = "Juan Carlos Durini",
                    fontSize = 19.sp
                )
            }

            Spacer(modifier = Modifier.height(40.dp))

            Text(
                text = "Sebastian Rodas\n25038",
                fontSize = 19.sp,
                textAlign = TextAlign.Center,
                lineHeight = 23.sp
            )
        }
    }
}