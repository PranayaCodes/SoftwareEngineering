package com.example.a37ai

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.a37ai.ui.theme._37AITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainBody()

        }
    }
}

@Composable
fun MainBody(){
    Column(
        horizontalAlignment =Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround,
        modifier=Modifier
            .fillMaxSize()
            .background(color= colorResource(R.color.pranaya))

//            .height(100.dp)
//            .width(100.dp)
    ){
        Text(text="Hello",style= TextStyle(
            fontSize = 70.sp,
            color = Color.White,
            fontStyle = FontStyle.Italic,
            textDecoration= TextDecoration.Underline,
            fontWeight = FontWeight.Bold
        ))
        Text(text="World")

        Image(
            painter = painterResource(id = R.drawable.rdr),
            contentDescription = null,
            modifier= Modifier.size(100.dp)
        )
    }
}

@Preview
@Composable
fun PreveiewBody(){
    MainBody()
}
