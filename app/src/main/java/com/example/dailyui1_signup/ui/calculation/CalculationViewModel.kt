package com.example.dailyui1_signup.ui.calculation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CalculationViewModel : ViewModel(){
    var cifra by mutableStateOf("")
        internal set

    var converted by mutableStateOf("")
        private set

    var convert by mutableStateOf(false)
        internal set

    var isMenuOf by mutableStateOf(false)
        internal set

    var isMenuFrom by mutableStateOf(false)
        internal set

    var coinOrigin by mutableStateOf(Coin.REAL)
        internal set

    var coinDestiny by mutableStateOf(Coin.DOLAR)
        internal set

    fun onKeyClick(toString: String) {
        val value = cifra.toDoubleOrNull() ?: 0.0
        if (value <= 0.0){
            converted = ""
            return
        }
        val result = CalculationLogic.convert(value = value, of = coinOrigin, from = coinDestiny)
        converted = result.toString()
    }
}