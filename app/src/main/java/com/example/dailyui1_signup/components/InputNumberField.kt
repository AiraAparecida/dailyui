package com.example.dailyui1_signup.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType

@Composable
fun InputNumberCardField(label: String, modifier: Modifier = Modifier) {
    var number by remember { mutableStateOf("") }

    OutlinedTextField(
        value = number,
        onValueChange = { input ->
            val apenasNumeros = input.filter { it.isDigit() }.take(14)
            number = apenasNumeros
        },
        label = { Text(text = label) },
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Number
        ),
        modifier = modifier.fillMaxWidth()
    )
}


@Composable
fun InputNumberCardTextField(label: String, modifier: Modifier = Modifier) {
    var number by remember { mutableStateOf("") }

    TextField(
        value = number,
        onValueChange = { input ->
            val apenasNumeros = input.filter { it.isDigit() }.take(14)
            number = apenasNumeros
        },
        label = { Text(text = label) },
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Number
        ),
        modifier = modifier.fillMaxWidth()
    )
}

@Composable
fun InputNumberCardFieldShort(label: String, modifier: Modifier = Modifier){

    var number by remember { mutableStateOf("") }

    OutlinedTextField(
        value = number,
        onValueChange = { input ->
            val apenasNumeros = input.filter { it.isDigit() }.take(3)
            number = apenasNumeros
        },
        label = { Text(text = label) },
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Number
        ),
        modifier = modifier.fillMaxWidth()
    )
}