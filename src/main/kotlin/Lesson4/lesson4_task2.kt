package org.example.Lesson4

fun main() {

    var weight = 20
    var volume = 80
    println("Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': ${(weight > MINIMUM_WEIGHT) && (weight <= MAXIMUM_WEIGHT) && (volume <= MAXIMUM_VOLUME)}")

    weight = 50
    volume = 100
    println("Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': ${(weight > MINIMUM_WEIGHT) && (weight <= MAXIMUM_WEIGHT) && (volume <= MAXIMUM_VOLUME)}")

}

const val MINIMUM_WEIGHT = 35
const val MAXIMUM_WEIGHT = 100
const val MAXIMUM_VOLUME = 100