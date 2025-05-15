package org.example.Lesson2

fun main() {


    val grade1 = 3
    val grade2 = 4
    val grade3 = 3
    val grade4 = 5
    val totalGrade: Float = (grade1 + grade2 + grade3 + grade4).toFloat()
    val totalStudents = 4
    val averageGrade: Float = totalGrade / totalStudents
    println(averageGrade)

}