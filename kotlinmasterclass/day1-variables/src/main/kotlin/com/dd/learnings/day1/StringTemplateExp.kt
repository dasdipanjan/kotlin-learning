package org.example

fun main() {
    val myDogName = "Teddy"
    //Variables inside a string
    println("My dog name is $myDogName")
    //Expression inside a String
    println("I have ${1 + 1} cats.")
    println("I have ${10 / 2} dogs.")
    //Length of a string
    val catName = "My cat's name is \"Fluffy\""
    println("The catName variable length is ${catName.length}")
    val myCar = "My car won't start"
    println(myCar.substring(3, 6))
    var clientName = "John"
    println("Hello $clientName welcome to the store")
    val apples = 3
    val oranges = 6
    println("The total number of fruits is ${apples + oranges}")
    val client = "Mary"
    val products = 3
    val price = 30
    println("$client has taken $products products and needs to pay $price")
}