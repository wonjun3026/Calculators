package com.example.calculators2

// Assuming Add, Div, Sub, and Mul are classes or interfaces representing the respective operations.

class Calculate {

    fun calculate(abstractOperation: AbstractOperation, num1: Int, num2: Int): Int {
        return abstractOperation.calculate(num1,  num2)
    }
}