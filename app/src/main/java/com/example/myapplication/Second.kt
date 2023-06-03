package com.example.myapplication



import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController


@Composable
fun SecondScreen(navcont: NavHostController) {
    Column(modifier = Modifier.fillMaxSize().background(Color(0xFF009688)), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Welcome!")
        Button(onClick = {
            navcont.navigate(Home.route)
        }, colors = ButtonDefaults.buttonColors(Color(0xFF9C27B0))) {
            Text(text = "GO Back")
        }
    }
}
