package org.example

import org.example.domain.input.actor.InputActor

fun main(args: Array<String>) {
    val numericValue = InputActor.getNumericValue()

    println(numericValue)
}