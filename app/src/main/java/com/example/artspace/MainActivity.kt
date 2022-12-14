package com.example.artspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artspace.ui.theme.ArtSpaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtSpaceTheme {
                // A surface container using the 'background' color from the theme
                Surface()
                {
                    ArtSpaceScreen()


                }
            }
        }
    }
}

@Composable
fun ArtSpaceScreen(

)
{
    Column(
        modifier = Modifier.padding(32.dp),
        verticalArrangement = Arrangement.spacedBy(15.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.girl_2696947__480),
            contentDescription = null,
            modifier = Modifier.wrapContentWidth()
                .size(200.dp)
                .border(BorderStroke(1.dp, Color.Gray)),
            contentScale = ContentScale.Inside


        )
        Text(
            text = "Artwork Title",
            fontSize = 30.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold

        )

        Text(
            text = "Artwork Artist (Year)"
        )
        Spacer(Modifier.size(30.dp))
        Row(
            modifier = Modifier.padding(10.dp)


         ) {
            Button(
                onClick = { /*TODO*/ })
            {
                Text(text = "Anterior")
                
                
            }
            Spacer(Modifier.size(16.dp)
            )
            Button(onClick = { /*TODO*/ })
            {
                Text(text = "Siguiente")
                
            }
            
        }




        }

    }


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ArtSpaceTheme {
        ArtSpaceScreen()

    }
}