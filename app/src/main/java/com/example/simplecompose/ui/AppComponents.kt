package com.example.simplecompose.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text


import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.simplecompose.R


@Composable
fun TopBar(topBarTitle: String) {

    Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
        Text(
            text = topBarTitle,
            color = Color.Black,
            fontSize = 24.sp,
            fontWeight = FontWeight.Medium
        )

        Spacer(modifier = Modifier.weight(1f))

        Image(
            modifier = Modifier.size(80.dp),
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "logo"
        )
    }
}

@Composable
@Preview(showBackground = true)
fun TopBarPreview() {
    TopBar("Hi There")
}

@Composable
fun TextComponent(textValue: String, textSize: TextUnit, color: Color = Color.Black) {
    Text(text = textValue, fontSize = textSize, color = color, fontWeight = FontWeight.Light)
}

@Composable
@Preview(showBackground = true)
fun TextComponentPreview() {
    TextComponent("Native Mobile Bits", 24.sp)
}


@Composable
fun TextFieldComponent(onTextChanged: (name: String) -> Unit) {
    var currentValue by remember {
        mutableStateOf("")
    }
    val localFocusManager = LocalFocusManager.current
    OutlinedTextField(
        value = currentValue,
        onValueChange = {
            onTextChanged(it)
            currentValue = it
        },
        placeholder = { Text(text = "Enter you name", fontSize = 18.sp) },
        textStyle = TextStyle.Default.copy(fontSize = 24.sp),
        keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done),
        keyboardActions = KeyboardActions{
            localFocusManager.clearFocus()
        }
    )
}

@Composable
@Preview(showBackground = true)
fun TextFieldComponentPreview() {
    TextFieldComponent {}
}