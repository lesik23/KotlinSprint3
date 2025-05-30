package org.example.Lesson2
import kotlin.math.pow

fun main() {

    val initialAmount = 70000
    val interestRate = 0.165
    val years = 20
    val compoudingsPerYear = 1

    val totalAmount = initialAmount *(1 + interestRate / compoudingsPerYear).pow(compoudingsPerYear * years)
    val formatedTotalAmount: String = String.format("%.3f", totalAmount)
    println(formatedTotalAmount)


}