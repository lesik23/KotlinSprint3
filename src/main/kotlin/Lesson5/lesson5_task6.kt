package org.example.Lesson5

fun main() {

    print("Введите ваш вес в килограммах: ")
    val weight = readln().toFloat()
    print("Ведите ваш рост в сантиметрах: ")
    val height = readln().toFloat()
    val cmInMeters = 100
    val heightInMeters = height / cmInMeters
    val heightSquared = heightInMeters * heightInMeters
    val bodyMassIndex = weight / heightSquared
    val lowBMI = 18.5
    val averageBMI = 25
    val highBMI = 30
    val categoryBMI = when {
        bodyMassIndex < 18.5 -> "недостаточная масса тела."
        bodyMassIndex >= lowBMI && bodyMassIndex < averageBMI -> "нормальная масса тела."
        bodyMassIndex >= averageBMI && bodyMassIndex <= highBMI -> "избыточная масса тела."
        bodyMassIndex >= highBMI -> "Ожирение"
        else -> "Ошибка "
    }
    val formatedBMI = String.format("%.2f", bodyMassIndex)
    println("Ваш индекс массы тела равен $formatedBMI. Это означает,что у вас $categoryBMI")

}