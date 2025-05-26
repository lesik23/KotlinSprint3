package org.example.Lesson5

fun main() {

    print("Попробуйте угадать два числа от 0 до 42. Введите первое число: ")
    var numberOne = readln().toInt()
    print("Введите второе число: ")
    var numberTwo = readln().toInt()
    if (numberOne == RIGHT_NUMBER_ONE || numberOne == RIGHT_NUMBER_TWO && numberTwo == RIGHT_NUMBER_TWO || numberTwo == RIGHT_NUMBER_ONE)
    {
        println("Поздравляем, вы выиграли!")
    }
    else if (numberOne == RIGHT_NUMBER_ONE || numberOne == RIGHT_NUMBER_TWO || numberTwo == RIGHT_NUMBER_TWO || numberTwo == RIGHT_NUMBER_ONE)
    {
        println("Вы выиграли утешительный приз!")
        println("Правильный ответ: 11 и 22")
    } else
    {
        println("Неудача!")
        println("Правильный ответ: 11 и 22")
    }

}

const val RIGHT_NUMBER_ONE = 11
const val RIGHT_NUMBER_TWO = 22