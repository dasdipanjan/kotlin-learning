package com.dd.learning

fun main(array: Array<String>) {
    println("Please enter year of birth")
    var yearOfBirth = readln()?:""
    val estimatedAge = (2024 - yearOfBirth.toInt());
    println("Year of Birth is $yearOfBirth and estimated age $estimatedAge")
}