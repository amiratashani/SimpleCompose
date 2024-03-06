package com.example.simplecompose.data

sealed class UserDataEvents{
    data class UserNameEntered(val name:String):UserDataEvents()
    data class AnimalSelected(val animalValue:String):UserDataEvents()
}