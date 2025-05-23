package org.example.Lesson4

fun main() {

    var weatherIsSunnyToday:Boolean = true
    var tentIsOpen: Boolean = true
    var airHumidity: Int = 20
    var season: String = "зима"
    var comparisonResult: Boolean = (weatherIsSunnyToday == true) && (tentIsOpen == true) && (airHumidity == 20) && (season != "зима")
    println("Благоприятные ли условия сейчас для роста бобовых? $comparisonResult" )

}
