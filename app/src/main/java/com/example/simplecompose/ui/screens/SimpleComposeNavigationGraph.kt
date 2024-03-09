package com.example.simplecompose.ui.screens

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.simplecompose.ui.UserInputViewModel
import com.example.simplecompose.ui.screens.Routes.ANIMAL_SELECTED
import com.example.simplecompose.ui.screens.Routes.USER_NAME

@Composable
fun SimpleComposeNavigationGraph(userInputViewModel: UserInputViewModel = viewModel()) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.USER_INPUT_SCREEN) {

        composable(Routes.USER_INPUT_SCREEN) {
            UserInputScreen(userInputViewModel) {
                navController.navigate(Routes.WELCOME_SCREEN+"/${it.first}/${it.second}")
            }
        }
        composable(
            "${Routes.WELCOME_SCREEN}/{$USER_NAME}/{${ANIMAL_SELECTED}}",
            arguments = listOf(
                navArgument(name = USER_NAME){type= NavType.StringArrayType},
                navArgument(name = ANIMAL_SELECTED){type= NavType.StringArrayType},
            )
        ) {
            val username = it?.arguments?.getString(USER_NAME)
            val animalSelected = it?.arguments?.getString(ANIMAL_SELECTED)
            WelcomeScreen(username,animalSelected)
        }

    }
}