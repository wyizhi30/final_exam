package com.example.wyizhi30

import android.graphics.Color
import android.graphics.Paint
import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.wyizhi30.ui.theme.汪奕幟Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            汪奕幟Theme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "作者：汪奕幟")
        Image(
            painter = painterResource(id = R.drawable.map),
            contentDescription = "Map Image"
        )
    }


    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Canvas(
            modifier = Modifier.fillMaxSize()
        ) {
            val blueColor = Color.BLUE
            val rect1Text = "臺中市清水區南社社區發展協會"
            val rect2Text = "臺中市港區藝術中心"

            val rect1Size = Size(30f, 30f)
            val rect1Position = Offset(
                size.width - rect1Size.width - 270f,
                size.height - rect1Size.height - 60f
            )
            drawRect(color = androidx.compose.ui.graphics.Color.Blue, topLeft = rect1Position, size = rect1Size)
//
            val rect2Size = Size(30f, 30f)
            val rect2Position = Offset(790f, 205f)
            drawRect(color = androidx.compose.ui.graphics.Color.Blue, topLeft = rect2Position, size = rect2Size)
//
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    汪奕幟Theme {
        Greeting("Android")
    }
}