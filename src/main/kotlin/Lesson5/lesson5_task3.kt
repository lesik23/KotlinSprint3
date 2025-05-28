package org.example.Lesson5

fun main() {

    print("Попробуйте угадать два числа от 0 до 42. Введите первое число: ")
    val numberOne = readln().toInt()
    print("Введите второе число: ")
    val numberTwo = readln().toInt()
    val winNumber1 = (0..42).random()
    val winNumber2 = (0..42).random()

    if (numberOne == winNumber1 || numberOne == winNumber2 && numberTwo == winNumber2 || numberTwo == winNumber1) {
        println("Поздравляем, вы выиграли!")
    } else if (numberOne == winNumber1 || numberOne == winNumber2 || numberTwo == winNumber2 || numberTwo == winNumber1) {
        println("Вы выиграли утешительный приз!")
        println("Правильный ответ: $winNumber1 и $winNumber2")
    } else {
        println("Неудача!")
        println("Правильный ответ: $winNumber1 и $winNumber2")
    }

}