package com.example.laboratorio02

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import com.example.laboratorio02.R


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                GreetingCard()
            }
        }
    }
}
@Composable
fun GreetingCard() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Welcome to the Course!",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color.DarkGray
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Hello, Student!",
            fontSize = 20.sp,
            fontStyle = FontStyle.Italic,
            color = Color.Blue,
        )
        Spacer(modifier = Modifier.height(16.dp))
        TextField(
            value = "",
            onValueChange = {},
            label = { Text("Enter your name") }
        )
        Spacer(modifier = Modifier.height(16.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Button(onClick = { /* Simulación de acción */ },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Blue,
                    contentColor = Color.White
                )
            )
            {
                Text("Accept")
            }
            Button(onClick = { /* Simulación de acción */ },
                enabled = false
            )
            {
                Text("Decline")
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Image(
            painter = painterResource(id = R.drawable.logo_tecsup),
            contentDescription = "Course Image",
            modifier = Modifier.size(100.dp)
        )
    }
}
@Preview(showBackground = true)
@Composable
fun PreviewGreetingCard() {
    GreetingCard()
}









