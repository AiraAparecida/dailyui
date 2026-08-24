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
fun InputDateField(modifier: Modifier) {
    var dataInput by remember { mutableStateOf("") }

    OutlinedTextField(
        value = dataInput,
        onValueChange = { novoTexto ->
            val apenasNumeros = novoTexto.filter { it.isDigit() }.take(8)

            val dataFormatada = buildString {
                for (i in apenasNumeros.indices) {
                    append(apenasNumeros[i])
                    if ((i == 1 && apenasNumeros.length > 2) || (i == 3 && apenasNumeros.length > 4)) {
                        append("/")
                    }
                }
            }
            dataInput = dataFormatada
        },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
        label = { Text("Data - (DD/MM/AAAA)") },
        modifier = Modifier.fillMaxWidth()

    )
}

@Composable
fun InputDateFieldText() {
    var dataInput by remember { mutableStateOf("") }

    TextField(
        value = dataInput,
        onValueChange = { novoTexto ->
            val apenasNumeros = novoTexto.filter { it.isDigit() }.take(8)

            val dataFormatada = buildString {
                for (i in apenasNumeros.indices) {
                    append(apenasNumeros[i])
                    if ((i == 1 && apenasNumeros.length > 2) || (i == 3 && apenasNumeros.length > 4)) {
                        append("/")
                    }
                }
            }
            dataInput = dataFormatada
        },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
        label = { Text("Data (DD/MM/AAAA)") },
        modifier = Modifier.fillMaxWidth()

    )
}