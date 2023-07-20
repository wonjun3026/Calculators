package com.example.calculators2

fun main(){
    var add:AbstractOperation = Add()
    var sub:AbstractOperation = Sub()
    var mul:AbstractOperation = Mul()
    var div:AbstractOperation = Div()
    var remain:AbstractOperation = Remain()
    var calculator = Calculate()
    println("첫 번째 숫자를 입력 하세요")
    var num1 = readLine()!!.toInt()
    println("기호를 입력하세요")
    var tmp = readLine()!!.toString()
    println("두 번째 숫자를 입력 하세요")
    var num2 = readLine()!!.toInt()



    when (tmp) {
        "+" -> {
            println("${num1}+${num2}=${calculator.calculate(add,num1,num2)}")
        }
        "-" -> {
            println("${num1}-${num2}=${calculator.calculate(sub,num1,num2)}")
        }
        "*" -> {
            println("${num1}*${num2}=${calculator.calculate(mul,num1, num2)}")
        }
        "/" -> {
            println("${num1}/${num2}=${calculator.calculate(div,num1, num2)}")
        }
        "%" -> {
            println("${num1}%${num2}=${calculator.calculate(remain,num1, num2)}")
        }
    }
}



