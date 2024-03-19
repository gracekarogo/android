package com.example.midmorning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.midmorning.ui.theme.MidMorningTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Demo()
        }
    }
}

@Composable
fun Demo(){
    Column(modifier = Modifier.fillMaxSize()){
        Text(text = "Welcome to android",

            color = Color.Red,
            fontSize = 30.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Types of cars",
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Red)
                .height(40.dp),
            textAlign = TextAlign.Center,
            textDecoration = TextDecoration.Underline,
            color = Color.White,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "1.BMW",
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Black)
                .height(40.dp),
            textDecoration = TextDecoration.Underline,
            color = Color.White,
            fontWeight = FontWeight.Bold)

        Text(text = "-Found near kipro centre",
            fontWeight = FontWeight.Bold)

        Text(text = "2.Mercedes Benz",
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Blue)
                .height(40.dp),
            textDecoration = TextDecoration.Underline,
            color = Color.White,
            fontWeight = FontWeight.Bold)

        Text(text = "-Found near kipro centre",
            fontWeight = FontWeight.Bold)


        Text(text = "3.Ferrari",
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Magenta)
                .height(40.dp),
            textDecoration = TextDecoration.Underline,
            color = Color.White,
            fontWeight = FontWeight.Bold)

        Text(text = "-Found near kipro centre",
            fontWeight = FontWeight.Bold)


        Text(text = "4.Bughatti",
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.DarkGray)
                .height(40.dp),
            textDecoration = TextDecoration.Underline,
            color = Color.White,
            fontWeight = FontWeight.Bold)

        Text(text = "-Found near kipro centre",
            fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(20.dp))

        Box(modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center) {
            Image(painter = painterResource(id = R.drawable.dog1)
                , contentDescription = "dog",
                modifier = Modifier.size(200.dp))

        }
        Divider()
        
        Text(
            text = "emobilis Mobile Training Institute",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold)

      



    }
}

@Preview(showBackground = true)
@Composable
fun DemoPreview(){
    Demo()
}

