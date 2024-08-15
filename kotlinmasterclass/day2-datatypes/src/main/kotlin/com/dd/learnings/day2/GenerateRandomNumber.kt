package com.dd.learning

import kotlin.random.Random

fun main(array: Array<String>) {
    println("Generating Random Number : ")
    println("Random Number : ${Random.nextInt(1000)}")
    println("Random Number : ${Random.nextInt(1000, 2000)}")
    println("Random Number : ${Random.nextDouble(1000.90)}")
}