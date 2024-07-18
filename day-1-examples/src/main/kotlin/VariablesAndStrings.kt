package org.example

fun main() {
    //Escape character example in String.
    var escapeCharExample = "The answer is \"yes\" so you can proceed."
    println(escapeCharExample)
    //If string contains a backslash, it needs to be escaped
    var escapeCharInString = "I like to put backslash \\ in my code"
    println(escapeCharInString)
    //Chars in Kotlin. It is single character.
    var character = 'A'
    println(character)
    //Variables are two types in Kotlin
    // 1. var which is mutable in nature. It is changeable.
    // 2. val which is immutable in nature. It is not changeable.
    var numberOne = 100
    println(numberOne)
    numberOne = 218
    println(numberOne)
    val color = "Red"
    println(color)
    //color = "Black" //This is not a mutable variable.
    //Camel casing in Kotlin.
    var catName = "My cat's name is \"Fluffy\""
    println(catName)
    var slashes = "Two types of slashes: \\ and  /"
    println(slashes)
    var url = "http://www.google.com"
    println(url)
    println()
    println("---------------------------------------")
    println()
    val lineOne = "(\\(\\"
    val lineTwo = "(-.-)"
    val lineThree = "o_(\") (\")"
    println(lineOne)
    println(lineTwo)
    println(lineThree)

}