package com.example.simplecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.simplecompose.ui.screens.SimpleComposeNavigationGraph
import com.example.simplecompose.ui.theme.SimpleComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
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


