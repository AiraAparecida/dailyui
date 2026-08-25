package com.example.dailyui1_signup.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.dailyui1_signup.R
import com.example.dailyui1_signup.components.InputDateField
import com.example.dailyui1_signup.components.InputNumberCardField
import com.example.dailyui1_signup.components.InputNumberCardFieldShort

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CreditCard(navController: NavHostController) {
    var name by remember { mutableStateOf("") }

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            CenterAlignedTopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Blue, //MaterialTheme.colorScheme.secondaryContainer
                    titleContentColor = Color.White
                ),
                title = {
                    Text(
                        text = stringResource(R.string.finalicar_cartao_de_credito),
                        fontWeight = FontWeight.Bold,
                        fontSize = MaterialTheme.typography.titleLarge.fontSize
                    )
                },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Fechar",
                            tint = Color.White
                        )
                    }
                },
            )
        }
    ) { paint ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paint)
                .verticalScroll(rememberScrollState())
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.cartaocredito),
                contentDescription = "cartao de credito",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(90.dp)
            )

            OutlinedTextField(
                value = name,
                onValueChange = { name = it },
                label = { Text("Nome") },
                modifier = Modifier.fillMaxWidth()
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                InputNumberCardField(
                    label = stringResource(R.string.numero_cartao_credito),
                    modifier = Modifier.weight(0.7f)
                )

                InputNumberCardFieldShort(
                    label = stringResource(R.string.cvc),
                    modifier = Modifier.weight(0.3f)
                )
            }

            InputDateField(
                modifier = Modifier.fillMaxWidth()
            )

            Button(
                onClick = { },
                modifier = Modifier.fillMaxWidth(),
                contentPadding = PaddingValues(16.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Blue
                ),
                shape = RoundedCornerShape(6.dp)
            ) {
                Text(text = stringResource(R.string.confirme_sua_compra))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CreditCardPreview() {
    val navController = rememberNavController()
    CreditCard(navController = navController)
}

