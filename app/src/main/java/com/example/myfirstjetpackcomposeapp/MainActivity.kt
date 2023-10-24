package com.example.myfirstjetpackcomposeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.textInputServiceFactory
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.ui.graphics.painter.Painter


import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myfirstjetpackcomposeapp.ui.theme.MyFirstJetpackComposeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyFirstJetpackComposeAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "Student $name!",
            modifier = modifier.padding(top = 16.dp),
            fontSize = 30.sp,
            fontFamily = FontFamily.SansSerif,
            color = Color.Yellow,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "welcome class!",
            modifier = Modifier.padding(top = 16.dp, bottom = 16.dp),
            color = Color.White,
            fontFamily = FontFamily.SansSerif,
            fontSize = 25.sp
        )

        Image(
            painter = painterResource(id = R.drawable.imu), // Use the resource reference directly
            contentDescription = "Image",
            modifier = Modifier.size(400.dp)// Adjust the size as needed
        )




        var count by remember {
            mutableStateOf(0)
        }

        Text(
            text = "$count",
            modifier = Modifier.padding(top = 16.dp, bottom = 16.dp),
            color = Color.White,
            fontFamily = FontFamily.SansSerif,
            fontSize = 25.sp,

        )
        Row {


            Button(
                onClick = {
                count++
                }, colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Yellow,
                    contentColor = Color.Black
                ),
                shape = RoundedCornerShape(20.dp)
            ) {
                Text(text = "increment")
//           modifier = Modifier.padding(top = 16.dp, bottom = 16.dp)
//           color = Color.Black
            }

            Button(onClick = {
                count--
            }) {
                Text(text = "Decrement")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyFirstJetpackComposeAppTheme {
        Greeting("counter app")
    }
}