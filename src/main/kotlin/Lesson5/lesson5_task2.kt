package org.example.Lesson5

fun main() {

    var yearOfBirth = readln(). toInt()
    var currentYear = 2025
    val userAge = currentYear - yearOfBirth
    if (userAge >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    } else {
        println("Вернутьсяв главное меню")
    }

}

const val AGE_OF_MAJORITY = 18
