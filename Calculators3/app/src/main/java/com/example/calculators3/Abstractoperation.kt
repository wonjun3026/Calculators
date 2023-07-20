package com.example.calculators3

interface AbstractOperation {
    fun calculate(num1: Int, num2: Int):Int{
        return num1+num2
    }
}