package com.example.myapplication





interface Destinations {
    val route:String;
}

object Home : Destinations{
    override val route="Home"
}

object Second : Destinations{
    override val route="Second"
}