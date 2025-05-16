package org.example.Lesson2

fun main() {

    val departureHours = 9
    val departureMinutes = 39
    val minutesOfWay = 457
    val minutesPerHour = 60

    val totalHours = (departureMinutes + minutesOfWay) / minutesPerHour

    val arrivalHour = totalHours + departureHours
    print(arrivalHour)
    print(":")
    val arrivalMinutes = (departureMinutes + minutesOfWay) - totalHours * minutesPerHour
    print(arrivalMinutes)


}