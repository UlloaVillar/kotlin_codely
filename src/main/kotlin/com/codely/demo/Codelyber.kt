package com.codely.demo
import java.time.LocalDate
import java.time.Period
import kotlin.system.exitProcess

fun main() {
    println("Please enter a date with the format <yyyy-MM-DD>")
    supportNullableString(readLine()).takeUnless { // añade validacion, si no se dan las condiciones devuelve
        //null, ponemos el ? para no coger el null
        it.isNullOrEmpty() || it.isNullOrBlank()
    }?.let{ line -> // state funciton si no es null(condicion) haz esto
        val input = LocalDate.parse(line ).also {// devuelve lo que tiene a la izquierda, por ejemplo con un println
            println("You wrote $it")

        }

        with(Period.between(input, LocalDate.now())){
            println("The difference between current date and your sate is ${difference.years} years")

        }
    }



}

fun supportNullableString(line: String?) = line
