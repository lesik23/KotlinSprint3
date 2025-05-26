package org.example.Lesson3

fun main() {

    var whereFrom = "E2"
    var where = "E4"
    var strokeNumber = "1"
    var lineToSend = "$whereFrom $where $strokeNumber"
    println(lineToSend)

    whereFrom = "D2"
    where = "D3"
    strokeNumber = "2"
    lineToSend = "$whereFrom $where $strokeNumber"
    println(lineToSend)

}