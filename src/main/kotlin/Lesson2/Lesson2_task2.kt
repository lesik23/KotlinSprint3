package org.example.Lesson2

fun main() {

   val workers = 50
   val interns = 30
   val salaryOfWorker = 30000
   val salaryOfIntern = 20000

    val workerExpenses = workers * salaryOfWorker
    val totalExpenses = workerExpenses + interns * salaryOfIntern
    val averageSalary = totalExpenses / (workers + interns)

    println(workerExpenses)
    println(totalExpenses)
    println(averageSalary)

}