package org.example

fun main() {
    println("Please enter a number")
    val inputNumber = readln()
    val number = inputNumber.toInt()
    val doubleNumber = 3.141567
    val result = (number * doubleNumber)
    println("Result : $result")
    println("Type of Result : ${result::class.java}")
}