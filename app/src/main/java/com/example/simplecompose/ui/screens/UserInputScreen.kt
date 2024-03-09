package com.example.simplecompose.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.simplecompose.R
import com.example.simplecompose.data.UserDataEvents
import com.example.simplecompose.ui.AnimalCard
import com.example.simplecompose.ui.ButtonComponent
import com.example.simplecompose.ui.ButtonComponentPreview
import com.example.simplecompose.ui.TextComponent
import com.example.simplecompose.ui.TextFieldComponent
import com.example.simplecompose.ui.TopBar
import com.example.simplecompose.ui.UserInputViewModel

@Composable
fun UserInputScreen(userInputViewModel: UserInputViewModel) {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(18.dp)
        ) {
            TopBar("Hi There \uD83D\uDE0A")

            TextComponent("Let's learn about You !", 24.sp)

            Spacer(modifier = Modifier.size(20.dp))

            TextComponent(
                "This app will prepare a details page based on input provided by you !",
                18.sp
            )
            Spacer(modifier = Modifier.size(60.dp))

            TextComponent(textValue = "Name", textSize = 18.sp)
            Spacer(modifier = Modifier.size(10.dp))

            TextFieldComponent() {
                userInputViewModel.onEvent(UserDataEvents.UserNameEntered(it))
            }

            Spacer(modifier = Modifier.size(20.dp))

            TextComponent(textValue = "What do you like", textSize = 18.sp)

            Spacer(modifier = Modifier.size(10.dp))

            Row(modifier = Modifier.fillMaxWidth()) {
                AnimalCard(
                    image = R.drawable.ic_launcher_foreground,
                    userInputViewModel.uiState.value.animalSelected == "Cat"
                ) {
                    userInputViewModel.onEvent(UserDataEvents.AnimalSelected(it))
                }
                AnimalCard(
                    image = R.drawable.ic_launcher_foreground,
                    userInputViewModel.uiState.value.animalSelected == "Dog"
                ) {
                    userInputViewModel.onEvent(UserDataEvents.AnimalSelected(it))
                }
            }

            Spacer(modifier = Modifier.weight(1f))

            if (userInputViewModel.isValidState()) {
                ButtonComponent{

                }
            }
        }
    }
}

@Composable
@Preview()
fun UserInputScreenPreview() {
    UserInputScreen(UserInputViewModel())
}
