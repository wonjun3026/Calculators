package com.example.calculators3

class Calculate () {

    fun calculate(abstractOperation: AbstractOperation, num1: Int, num2: Int): Int{
        return abstractOperation.calculate(num1, num2)
    }
}