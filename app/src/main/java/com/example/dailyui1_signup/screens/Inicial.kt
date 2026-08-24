package com.example.dailyui1_signup.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.dailyui1_signup.R

@Composable
fun Inicial(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
    ) {
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = stringResource(R.string.daily_desafios),
        )

        Row {
            Button(
                onClick = {
                    navController.navigate("SingUp")
                },
            ) {
                Text("Dia 1 - SingUp")
            }
        }

        Row {
            Button(
                onClick = {
                    navController.navigate("CreditCard")
                },
            ) {
                Text("Dia 2 - CreditCard")
            }
        }
    }
}

@Preview
@Composable
fun PreviewInicial() {
    val navController = rememberNavController()
    Inicial(navController = navController)
}