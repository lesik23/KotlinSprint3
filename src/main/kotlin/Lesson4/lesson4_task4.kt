package org.example.Lesson4

fun main() {

    var trainingDay = 5
    var hands: Boolean = trainingDay % 2 != 0
    var legs: Boolean = trainingDay % 2 == 0
    var back: Boolean = trainingDay % 2 == 0
    var press: Boolean = trainingDay % 2 != 0
    println("""
        Упражнения для рук: $hands
        Упражнения для ног: $legs
        Упражнения для спины: $back
        Упражнения для пресса: $press     
    """.trimIndent())

}