package org.example.Lesson1

fun main() {

    val seconds: Short = 6480
    val secondsInMinute = 60
    val minute = seconds / secondsInMinute
    val minuteInHours = 60
    val hours = minute / minuteInHours

    val remainingSeconds = seconds % secondsInMinute
    val remainingMinut = minute % minuteInHours

    println("Время проведённое Гагариным в космосе:")
    println("0" + hours + ":" + remainingMinut + ":" + remainingSeconds + "0")

}