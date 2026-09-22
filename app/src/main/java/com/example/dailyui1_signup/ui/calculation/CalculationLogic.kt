package com.example.dailyui1_signup.ui.calculation

enum class Coin(val dollarRate: Double){
    DOLAR(1.0),
    REAL(0.19)
}

object CalculationLogic {
    fun convert(value: Double, of: Coin, from: Coin): Double {
        if (of == from) return value

        val valueInDollars = value * of.dollarRate
        return valueInDollars / from.dollarRate
    }
}

//    fun toReal(a: Double): Double {
//        return a * 5.33
//    }

//    fun toEuro(a: Double): Double {
//        return a * 0.18
//    }