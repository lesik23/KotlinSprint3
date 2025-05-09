package org.example.Lesson1

fun main() {

    val seconds: Short = 6480

    val minute = seconds / 60
    val hours = minute / 60

    val remainingSeconds = seconds % 60
    val remainingMinut = minute % 60

    println("Время проведённое Гагариным в космосе:")
    println("0" + hours + ":" + remainingMinut + ":" + remainingSeconds + "0" )

}