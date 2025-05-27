package org.example.Lesson5

fun main() {

    print("Введите ваш вес в килограммах: ")
    val weight = readln().toFloat()
    print("Ведите ваш рост в сантиметрах: ")
    val height = readln().toFloat()
    val heightInMeters = height / 100
    val heightSquared = heightInMeters * heightInMeters
    val bodyMassIndex = weight / heightSquared
    val categoryBMI = when {
        bodyMassIndex < 18.5 -> "недостаточная масса тела."
        bodyMassIndex >= 18.5 && bodyMassIndex < 25 -> "нормальная масса тела."
        bodyMassIndex >= 25 && bodyMassIndex <= 30 -> "избыточная масса тела."
        bodyMassIndex >= 30 -> "Ожирение"
        else -> "Ошибка "
    }
    val formatedBMI = String.format("%.2f", bodyMassIndex)
    println("Ваш индекс массы тела равен $formatedBMI. Это означает,что у вас $categoryBMI")

}