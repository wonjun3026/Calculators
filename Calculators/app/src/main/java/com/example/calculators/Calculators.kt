package com.example.calculators

fun main(){
    var add:Add = Add()
    var sub:Sub = Sub()
    var mul:Mul = Mul()
    var div:Div = Div()
    var remain:Remain = Remain()
    var calculator = Calculate(add, div, sub, mul, remain)
    println("첫 번째 숫자를 입력 하세요")
    var num1 = readLine()!!.toInt()
    println("기호를 입력하세요")
    var tmp = readLine()!!.toString()
    println("두 번째 숫자를 입력 하세요")
    var num2 = readLine()!!.toInt()



    when (tmp) {
        "+" -> {
            println("${num1}+${num2}=${calculator.add(num1,num2)}")
        }
        "-" -> {
            println("${num1}-${num2}=${calculator.sub(num1,num2)}")
        }
        "*" -> {
            println("${num1}*${num2}=${calculator.mul(num1, num2)}")
        }
        "/" -> {
            println("${num1}/${num2}=${calculator.div(num1, num2)}")
        }
        "%" -> {
            println("${num1}%${num2}=${calculator.remain(num1, num2)}")
        }
    }
}

