package com.example.simplecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.simplecompose.ui.screens.Routes
import com.example.simplecompose.ui.screens.Routes.USER_INPUT_SCREEN
import com.example.simplecompose.ui.screens.Routes.WELCOME_SCREEN
import com.example.simplecompose.ui.screens.SimpleComposeNavigationGraph
import com.example.simplecompose.ui.screens.UserInputScreen
import com.example.simplecompose.ui.screens.WelcomeScreen
import com.example.simplecompose.ui.theme.SimpleComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SimpleComposeTheme {
                SimpleComposeApp()
            }
        }
    }

    @Composable
    fun SimpleComposeApp() {
        SimpleComposeNavigationGraph()
    }
}


