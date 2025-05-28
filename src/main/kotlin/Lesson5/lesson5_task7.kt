package org.example.Lesson5

fun main() {

    print("Введите расстояние поездки в километрах: ")
    val distance = readln().toFloat()
    print("Введите расход топлива л/100км: ")
    val consumption = readln().toFloat()
    print("Введите стоимость литра топлива: ")
    val price = readln().toFloat()
    val fuelIsNeeded = (distance * consumption) / 100
    val totalPrice = fuelIsNeeded * price
    val formatedFuelIsNeeded = String.format("%.2f", fuelIsNeeded)
    val formatedTotalPrice = String.format("%.2f", totalPrice)
    println("Для поездки вам необходимо $formatedFuelIsNeeded л топлива. Стоимость топлива составит $formatedTotalPrice.")

}