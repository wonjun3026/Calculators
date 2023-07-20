package com.example.calculators2

class Remain: AbstractOperation {
    override fun calculate(num1: Int, num2: Int):Int {
        return num1%num2
    }
}