package com.example.myapplication



import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController



@ExperimentalMaterial3Api
@Composable
fun HomeScreen(navcont: NavHostController) {
    var username: String by remember { mutableStateOf("") }
    var password : String by remember { mutableStateOf("") }
    Column(modifier = Modifier.fillMaxSize().background(Color(0xFFDA03FF)), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        OutlinedTextField(
            value = username,
            onValueChange = {username=it},
            label = { Text(text = "Username") },
        )
        OutlinedTextField(
            value = password,
            onValueChange = {password=it},
            label = { Text(text = "Password") },
        )
        val context1= LocalContext.current
        Button(onClick = {
            if (username=="zoheir" && password=="123456"){
                navcont.navigate(Second.route)
            }else{
                Toast.makeText(context1,"Error Please Try Again",Toast.LENGTH_SHORT).show()
            }
        }, colors = ButtonDefaults.buttonColors(Color(0xFF009688))) {
            Text(text = "Login")
        }
    }
}