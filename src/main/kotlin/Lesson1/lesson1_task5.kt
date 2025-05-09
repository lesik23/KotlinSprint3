package org.example.Lesson1

fun main() {

    val seconds: Short = 6480

    val minute = seconds/60
    println(minute)
    val hours = minute/60
    println(hours)

    val ostOfMinute = 6480%3600
    println(ostOfMinute)
}