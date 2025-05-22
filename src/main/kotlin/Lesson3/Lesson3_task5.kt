package org.example.Lesson3


fun main() {

    val string = "D2-D4;0"
    val result = string.split("-",";")
    var whereFrom = (result[0])
    println(whereFrom)
    var where = (result[1])
    println(where)
    var strokeNumber = (result[2])
    println(strokeNumber)

}