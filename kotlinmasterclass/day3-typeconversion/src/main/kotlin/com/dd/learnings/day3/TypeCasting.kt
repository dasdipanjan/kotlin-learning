package org.example

fun main() {
    println("Type Casting Example")
    val cats = 3
    val longCats = cats.toLong()
    println(cats::class.java)
    println(longCats::class.java)
    //If you convert to a smaller type, some information might be lost or corrupted
    //Here changing from long to int.
    val people = 7500000000
    val fewPeople = people.toInt()
    println(fewPeople)
    //There are few methods for type conversion
    // toByte() toShort() toInt() toLong() toFloat() toDouble()
    println("Program Completed.")

    val dogs = 5
    val byteDogs = dogs.toByte()
    println(byteDogs::class.java)
    val floatDogs = dogs.toFloat()
    println(floatDogs::class.java)

}