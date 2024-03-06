package com.example.simplecompose.ui

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.simplecompose.data.UserDataEvents
import com.example.simplecompose.data.UserInputScreenState

class UserInputViewModel : ViewModel() {

    var uiState = mutableStateOf(UserInputScreenState())


    fun onEvent(event: UserDataEvents) {
        when (event) {
            is UserDataEvents.UserNameEntered -> {
                uiState.value = uiState.value.copy(nameEntered = event.name)
            }

            is UserDataEvents.AnimalSelected -> {
                uiState.value = uiState.value.copy(animalSelected = event.animalValue)
            }
        }
    }
}

