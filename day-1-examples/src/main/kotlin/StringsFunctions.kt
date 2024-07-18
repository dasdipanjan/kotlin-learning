package org.example

import java.util.*

fun main() {
    //Length of a given string.
    val myPet = "Crocodile"
    println("Length of String : " + myPet.length)
    //Capitalize a String
    val myName = "dipanjan"
    println(myName.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() })
    var myAnimal = "Dog"
    println(myAnimal.replaceFirstChar { it.lowercase(Locale.getDefault()) })
    val myText = "    Here are   to many spaces    "
    println(myText.trim())
    println(myPet.get(3))
    println(myPet.substring(3))
    println(myPet.substring(3, 6))
    println(myPet.reversed())
}