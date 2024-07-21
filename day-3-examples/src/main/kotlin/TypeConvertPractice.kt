package org.example

fun main() {
    println("Please enter a number : ")
    val strNumber = readln()
    val inputNumber = strNumber.toInt()
    println("Input Data Type : ${inputNumber::class.java}")
    val byteData = inputNumber.toByte()
    println("Byte Data Type : ${byteData::class.java}")
    val intData = inputNumber.toInt()
    println("Int Data Type : ${intData::class.java}")
    val longData = inputNumber.toLong()
    println("Long Data Type : ${longData::class.java}")
    val floatData = inputNumber.toFloat()
    println("Float Data Type : ${floatData::class.java}")
    val doubleData = inputNumber.toDouble()
    println("Double Data Type : ${doubleData::class.java}")
}