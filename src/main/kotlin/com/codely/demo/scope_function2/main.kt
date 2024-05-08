package com.codely.demo.scope_function2

import java.time.LocalDate
import java.time.Period
import kotlin.system.exitProcess

fun main() {
    println("Please enter a date with the format <yyyy-MM-DD>")
    supportNullableString(readLine()).takeUnless { // añade validacion, si no se dan las condiciones devuelve
        //null, ponemos el ? para no coger el null
        it.isNullOrEmpty() || it.isNullOrBlank()
    }?.let{
        println("$it")
        LocalDate.parse(it)
    }.apply { // recibimos el parsed localdate y devolvemos error encaso de que no sea localDate
        // Sirve para hacer mutaciones
        // devuelve la instancia que le llega
        if (this == null) {
            println("The date is not valid")
            exitProcess(1)
        }
    }.also {
        println("You wrote $it")
    }.run {
        with(Period.between(this, LocalDate.now())){
            println("The difference between current date and your sate is ${this.years} years")
        }

    }

}

fun supportNullableString(line: String?) = line