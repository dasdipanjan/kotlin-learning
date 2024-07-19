package com.dd.learning

fun main(array: Array<String>) {
    println("Input a number : ")
    val userInput = readLine()?:""
    println("You wrote: ${userInput.toInt() * 2}")
}