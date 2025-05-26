package org.example.Lesson4

fun main() {

    val minimumCrew = 50
    val optimumCrew = 70
    val minimumProvision = 50

    print("Есть ли повреждения?: ")
    val damage = readln()
    print("Количество экипажа: ")
    var numberOfCrew = readln().toInt()
    print("Количество ящиков с провизией: ")
    var numberOfBoxesWithProvision = readln().toInt()
    print("Благоприятная ли погода?: ")
    val goodWeather = readln()
    println("Корабль может отправиться в плавание: ${(damage != "да") && (numberOfCrew in minimumCrew..optimumCrew) &&
            (numberOfBoxesWithProvision > minimumProvision) && (goodWeather == "да") || (damage == "да") && (numberOfCrew == optimumCrew) && 
            (numberOfBoxesWithProvision >= minimumProvision) &&(goodWeather == "да")}")


}