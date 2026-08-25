package com.example.dailyui1_signup

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.dailyui1_signup.screens.CreditCard
import com.example.dailyui1_signup.screens.Inicial
import com.example.dailyui1_signup.screens.LandingPage
import com.example.dailyui1_signup.screens.SingUp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()

            NavHost(
                navController = navController,
                startDestination = "Inicial"
            ) {
                composable(route = "Inicial") {
                    Inicial(navController)
                }

                composable(route = "SingUp") {
                    SingUp(navController = navController)
                }

                composable(route = "CreditCard") {
                    CreditCard(navController = navController)
                }

                composable(route = "LandingPage") {
                    LandingPage(navController = navController)
                }
            }
        }
    }
}