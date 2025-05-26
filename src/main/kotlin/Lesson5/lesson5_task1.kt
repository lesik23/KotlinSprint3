package org.example.Lesson5
import kotlin.random.Random

fun main() {

    var number1:Int = Random.nextInt(1, 11)
    var number2:Int = Random.nextInt(1, 11)
    print("Пожалуйста, докажите, что вы не бот. Решите несложный пример: $number1 + $number2 = ")
    val answer = readln().toInt()
    val rightAnswer = number1 + number2
    if (answer == rightAnswer) {
        println("Добро пожаловать!")
    }
    else {
        println("Вход запрещён")
    }

}