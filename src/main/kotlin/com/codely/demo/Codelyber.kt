package com.codely.demo
import java.time.LocalDate

fun main() {
    println("Please enter a date with the format <yyyy-MM-DD>")
    val readLine: String? = null
    val input = LocalDate.parse(readLine ?: "2021-08-31")
    println("You wrote $input ${input.dayOfWeek}")
}
