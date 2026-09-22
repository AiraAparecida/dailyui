package com.example.dailyui1_signup.ui.inicial

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
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
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.titleLarge
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
        ){
            Button(
                modifier = Modifier.weight(0.5f),
                onClick = {
                    navController.navigate("SingUp")
                }
            ) {
                Text("Dia 1 - SingUp")
            }

            Spacer(modifier = Modifier.padding(8.dp))

            Button(
                modifier = Modifier.weight(0.5f),
                onClick = {
                    navController.navigate("CreditCard")
                }
            ) {
                Text("Dia 2 - CreditCard")
            }
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
        ){
            Button(
                modifier = Modifier.weight(0.5f),
                onClick = {
                    navController.navigate("LandingPage")
                },
            ) {
                Text("Dia 3-LandingPage")
            }

            Spacer(modifier = Modifier.padding(8.dp))

            Button(
                modifier = Modifier.weight(0.5f),
                onClick = {
                    navController.navigate("Calculation")
                },
            ) {
                Text("Dia 4 - Calculation")
            }
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
        ){
            Button(
                modifier = Modifier.weight(0.5f),
                onClick = {
                    navController.navigate("AppIcon")
                },
            ) {
                Text("Dia 5 - App Icon")
            }

            Spacer(modifier = Modifier.padding(8.dp))

            Button(
                modifier = Modifier.weight(0.5f),
                onClick = {
                    navController.navigate("")
                },
            ) {
                Text("Dia 6 - ")
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