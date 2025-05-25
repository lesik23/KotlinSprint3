package org.example.Lesson5

fun main() {

    print("Пожалуйста, докажите, что вы не бот. Решите несложный пример: 7+3=")
    var answer = readln().toInt()
    if (answer == RIGHT_ANSWER) {
        println("Добро пожаловать!")
    }
    else {
        println("Вход запрещён")
    }


}

const val RIGHT_ANSWER = 10
