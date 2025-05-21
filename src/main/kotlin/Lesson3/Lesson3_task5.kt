package org.example.Lesson3

fun main() {

    val string = "D2-D4;0"
    val result = string.split("-")
    var whereFrom = (result[0])
    println(whereFrom)
    var partTwoOfResult = result[1].split(";")
    println(partTwoOfResult[0])
    var strokeNumber = partTwoOfResult[1]
    println(strokeNumber)

}