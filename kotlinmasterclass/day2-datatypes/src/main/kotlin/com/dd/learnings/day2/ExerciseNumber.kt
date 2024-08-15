package com.dd.learning

fun main() {
    println("Input a number : ")
    val myNumber = readln()?:""
    val result = myNumber.toInt() * 5
    println("$myNumber * 5 = $result")
}