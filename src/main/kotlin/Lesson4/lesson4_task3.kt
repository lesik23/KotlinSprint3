package org.example.Lesson4

fun main() {

    var comparisonResult: Boolean = (WEATHER_IS_SUNNY_TODAY == true) && (TENT_IS_OPEN == true) && (AIR_HUMIDITY == 20) && (SEASON != "зима")
    println("Благоприятные ли условия сейчас для роста бобовых? $comparisonResult" )

}

const val WEATHER_IS_SUNNY_TODAY: Boolean = true
const val TENT_IS_OPEN: Boolean = true
const val AIR_HUMIDITY: Int =20
const val SEASON: String = "зима"
