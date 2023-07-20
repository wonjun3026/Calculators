package com.example.calculators3

fun main(){
    var add:AbstractOperation = Add()
    var div:AbstractOperation = Div()
    var sub:AbstractOperation = Sub()
    var mul:AbstractOperation = Mul()
    var remain:AbstractOperation = Remain()
    var calculate = Calculate()
    println("첫번째 숫자를 입력하세요")
    var num1 = readLine()!!.toInt()
    println("기호를 입력하세요")
    var tmp = readLine()!!.toString()
    println("두번째 숫자를 입력하세요")
    var num2 = readLine()!!.toInt()

    when (tmp){
        "+"->{
            println("${num1}+${num2}= ${calculate.calculate(add, num1, num2)}")
        }
        "-"->{
            println("${num1}-${num2}= ${calculate.calculate(sub,num1, num2)}")
        }
        "*"->{
            println("${num1}*${num2}= ${calculate.calculate(mul,num1, num2)}")
        }
        "/"->{
            println("${num1}/${num2}= ${calculate.calculate(div,num1, num2)}")
        }
        "%"->{
            println("${num1}%${num2}= ${calculate.calculate(remain,num1, num2)}")
        }
    }
}