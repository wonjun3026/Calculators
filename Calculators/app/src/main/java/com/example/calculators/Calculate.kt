package com.example.calculators

// Assuming Add, Div, Sub, and Mul are classes or interfaces representing the respective operations.

class Calculate(private val add: Add, private val div: Div, private val sub: Sub, private val mul: Mul, private val remain: Remain) {

    fun add(num1: Int, num2: Int): Int {
        return add.calculate(num1,  num2)
    }

    fun sub(num1: Int, num2: Int): Int {
        return sub.calculate(num1, num2)
    }

    fun mul(num1: Int, num2: Int): Int {
        return mul.calculate(num1, num2)
    }

    fun div(num1: Int, num2: Int): Int {
        return div.calculate(num1, num2)
    }

    fun remain(num1: Int, num2: Int): Int {
        return remain.calculate(num1, num2)
    }
}