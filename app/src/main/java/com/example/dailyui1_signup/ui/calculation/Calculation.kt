package com.example.dailyui1_signup.ui.calculation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun Calculation(
    navController: NavController,
    viewModel: CalculationViewModel
) {
    Scaffold { paint ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paint)
                .verticalScroll(rememberScrollState())
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Converter Moeda",
                fontSize = MaterialTheme.typography.titleLarge.fontSize,
                fontWeight = FontWeight.Bold
            )

            TextField(
                value = viewModel.cifra,
                onValueChange = { viewModel.cifra = it },
                label = { Text("Valor") },
                modifier = Modifier.fillMaxWidth()
            )

//            Row(
//                modifier = Modifier.fillMaxWidth()
//            ) {
//                Button(
//                    onClick = { convert = !convert },
//                    shape = RoundedCornerShape(6.dp),
//                    colors = ButtonDefaults.buttonColors(
//                        containerColor = MaterialTheme.colorScheme.surfaceContainerHighest,
//                    ),
//                    modifier = Modifier.weight(0.5f)
//                ) {
//                    Text(
//                        text = "escolha",
//                        color = Color.Black
//                    )
//                }
//                DropdownMenu(
//                    expanded = convert,
//                    onDismissRequest = { convert = false }
//                ) {
//                    DropdownMenuItem(
//                        text = { Text("Dolar") },
//                        onClick = {}
//                    )
//                    DropdownMenuItem(
//                        text = { Text("Real") },
//                        onClick = {}
//                    )
//                }
//                Spacer(modifier = Modifier.width(4.dp))
//
//                Button(
//                    onClick = { converted = !converted },
//                    shape = RoundedCornerShape(6.dp),
//                    colors = ButtonDefaults.buttonColors(
//                        containerColor = MaterialTheme.colorScheme.surfaceContainerHighest,
//                    ),
//                    modifier = Modifier.weight(0.5f)
//                ) {
//                    Text(
//                        text = "escolha",
//                        color = Color.Black
//                    )
//                }
//                DropdownMenu(
//                    expanded = converted,
//                    onDismissRequest = { converted = false }
//                ) {
//                    DropdownMenuItem(
//                        text = { Text("Dolar") },
//                        onClick = {}
//                    )
//                    DropdownMenuItem(
//                        text = { Text("Real") },
//                        onClick = {}
//                    )
//                }
//            }

            Button(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(6.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Green
                ),
                onClick = {
                    val cifra = null
                    viewModel.onKeyClick(cifra.toString())
                }
            ) {
                Text(
                    text = "Converter Moeda"
                )
            }

        }

    }
}