package com.example.simplecompose.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun WelcomeScreen() {
    Text(modifier = Modifier
        .fillMaxSize()
        .height(80.dp), text = Routes.WELCOME_SCREEN)
}

@Composable
@Preview
fun WelcomeScreenPreview(){
    WelcomeScreen()
}