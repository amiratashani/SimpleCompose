package com.example.simplecompose.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.simplecompose.ui.FactComposable
import com.example.simplecompose.ui.TextComponent
import com.example.simplecompose.ui.TextWithShadow
import com.example.simplecompose.ui.TopBar

@Composable
fun WelcomeScreen(username: String?, animalSelected: String?) {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(18.dp)
        ) {
            TopBar(topBarTitle = "Welcome $username \uD83D\uDE0D")

            TextComponent(textValue = "Thank You! for sharing your data", textSize = 24.sp)

            Spacer(modifier = Modifier.size(60.dp))

            val finalText =
                if (animalSelected == "Cat") "You are a Cat lover \uD83D\uDC36" else "You are a dog lover \uD83D\uDC31"
            TextWithShadow(text = finalText)


            FactComposable(text = "Here is the first fact")
        }
    }

}

@Composable
@Preview
fun WelcomeScreenPreview() {
    WelcomeScreen("Amir", "Dog")
}