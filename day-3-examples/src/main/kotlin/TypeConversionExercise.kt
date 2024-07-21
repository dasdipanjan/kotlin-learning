package org.example

fun main() {
    println("PI Conversion exercise")
    var pi = 4.14159
    println("Type of PI : ${pi::class.java}")
    val piInt = pi.toInt()
    println("Type of PI : ${piInt::class.java}")
    var piFloat = pi.toFloat()
    println("Type of PI : ${piFloat::class.java}")
    var piString = pi.toString()
    println("Type of PI : ${piString::class.java}")
}