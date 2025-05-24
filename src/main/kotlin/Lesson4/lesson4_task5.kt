package org.example.Lesson4

fun main() {

    print("Есть ли повреждения?: ")
    val damage: Boolean = readln() == "да"
    print("Количество экипажа: ")
    var numberOfCrew = readln().toInt()
    print("Количество ящиков с провизией: ")
    var numberOfBoxesWithProvision = readln().toInt()
    print("Благоприятная ли погода?: ")
    val goodWeather: Boolean = readln() == "да"
    println("Корабль может отправиться в плавание: ${(damage != true) && (numberOfCrew in 55..70) &&
            (numberOfBoxesWithProvision > 50) && (goodWeather == true) || (damage == true) && (numberOfCrew == 70) && 
            (numberOfBoxesWithProvision >= 50) &&(goodWeather == true)}")


}