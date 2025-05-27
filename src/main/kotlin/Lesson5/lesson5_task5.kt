package org.example.Lesson5

fun main() {

    print("Попробуйте угадать три числа от 0 до 42. Введите первое число: ")
    val numberOne = readln().toInt()
    print("Введите второе число: ")
    val numberTwo = readln().toInt()
    print("Введите третье число: ")
    val numberThree = readln().toInt()
    val enteredNumbers = mutableListOf<Int>(numberOne, numberTwo, numberThree)

    val winNumber1 = (0..42).random()
    val winNumber2 = (0..42).random()
    val winNumber3 = (0..42).random()
    val winNumbers = mutableListOf<Int>(winNumber1, winNumber2, winNumber3)

    val comparison = enteredNumbers.intersect(winNumbers)
    val numberOfCommonElements = comparison.size
    when (numberOfCommonElements) {
        3 -> println("Вы угадали все числа и выиграли джекпот!")
        2 -> println("вы угадали два числа и выиграли крупный приз!")
        1 -> println("Вы угадали одно число и выиграли утешительный приз!")
        0 -> println("Вы не угадали ни одного числа ")
    }
        println("Правильный ответ: $winNumber1, $winNumber2 и $winNumber3")

}