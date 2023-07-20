package com.example.calculators2

interface AbstractOperation {
    fun calculate(num1:Int, num2:Int):Int{
        return num1+num2
    }
}