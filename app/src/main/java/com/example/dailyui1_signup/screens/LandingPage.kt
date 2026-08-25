package com.example.dailyui1_signup.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.dailyui1_signup.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LandingPage(navController: NavController) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                title = {},
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Fechar",
                            tint = Color.Black
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
            Surface(
                modifier = Modifier.padding(4.dp),
                shape = RoundedCornerShape(18.dp),
                color = MaterialTheme.colorScheme.tertiaryContainer
            ) {
                Text(
                    text = stringResource(R.string.ficção_científica),
                    modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp),
                    style = MaterialTheme.typography.labelLarge,
                    color = MaterialTheme.colorScheme.tertiary,
                    fontFamily = FontFamily.Serif,
                )
            }

            Text(
                text = stringResource(R.string.além_do_horizonte_quântico),
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Serif,
                fontSize = MaterialTheme.typography.displaySmall.fontSize,
                textAlign = TextAlign.Center
            )

            Text(
                text = stringResource(R.string.uma_viagem_atraves_do_tempo),
                fontFamily = FontFamily.Serif,
                fontSize = MaterialTheme.typography.titleLarge.fontSize,
                textAlign = TextAlign.Center
            )

            Text(
                modifier = Modifier.padding(6.dp),
                text = stringResource(R.string.de_john_doe),
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Serif,
                fontSize = MaterialTheme.typography.titleLarge.fontSize,
                textAlign = TextAlign.Center
            )

            Text(
                text = stringResource(R.string.lorem),
                fontFamily = FontFamily.Serif,
                fontSize = MaterialTheme.typography.bodyLarge.fontSize,
                textAlign = TextAlign.Center
            )

            Row(
                modifier = Modifier.padding(8.dp),
            ) {
                Button(
                    contentPadding = PaddingValues(16.dp),
                    onClick = { },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = MaterialTheme.colorScheme.tertiary,
                    )
                ) {
                    Text(
                        text = stringResource(R.string.adquira_seu_exemplar),
                        fontFamily = FontFamily.Serif,
                    )
                }

                Spacer(modifier = Modifier.width(8.dp))

                OutlinedButton(
                    contentPadding = PaddingValues(16.dp),
                    onClick = { },
                    border = BorderStroke(1.dp, MaterialTheme.colorScheme.tertiary)
                ) {
                    Text(
                        text = stringResource(R.string.leia_a_prévia),
                        fontFamily = FontFamily.Serif,
                        color = MaterialTheme.colorScheme.tertiary
                    )
                }
            }
            Image(
                painter = painterResource(id = R.drawable.book_1),
                contentDescription = "cartao de credito",
                //modifier = Modifier.fillMaxWidth()
                //.height(90.dp)
            )
        }
    }
}