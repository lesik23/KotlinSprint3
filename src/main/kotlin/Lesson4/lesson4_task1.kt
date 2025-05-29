package org.example.Lesson4

fun main() {

    var tablesBookedToday = 13
    var tablesBookedTomorrow = 9
    val tablesAvailableToday: Boolean = tablesBookedToday < TOTAL_TABLES
    val tablesAvailableTomorrow: Boolean = tablesBookedTomorrow < TOTAL_TABLES
    println("Доступно столиков сегодня: $tablesAvailableToday \n" +
            "Доступно столиков завтра: $tablesAvailableTomorrow")

}

const val TOTAL_TABLES = 13