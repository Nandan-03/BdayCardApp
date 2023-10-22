package com.example.bdaycard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bdaycard.ui.theme.BdayCardTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.ui.layout.ContentScale

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BdayCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage(message = "Happy Bday Rex", from ="From loki" )
                }
            }
        }
    }
}


@Composable
fun GreetingText(message: String,from: String,modifier: Modifier = Modifier) {
Column(verticalArrangement=Arrangement.Center,
    modifier = modifier.padding(8.dp)) {
    Text(
        text = message,
        fontSize = 100.sp,
        lineHeight = 116.sp,
        textAlign= TextAlign.Center
    )
    Text(
        text = from,
        fontSize = 36.sp,
        modifier = Modifier.padding(16.dp)
    )
}
}
@Composable
fun GreetingImage(message: String,from: String,modifier: Modifier=Modifier){
    val image = painterResource(R.drawable.androidparty)
    Box {
        Image(
            painter = image,
            contentDescription = null,
            contentScale= ContentScale.Crop,
            alpha = 0.5f
        )
        GreetingText(message = message, from = from,modifier=Modifier
            .padding(8.dp)
            .fillMaxSize()
        )
    }
}
@Preview(showBackground = true)
@Composable
fun BdayCardPreview() {
    BdayCardTheme {
GreetingImage("Happy Bday Rex","From Loki")
    }
}