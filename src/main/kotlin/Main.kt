package org.example

import org.example.domain.input.actor.InputActor
import org.example.domain.output.actor.OutputActor
import org.example.domain.output.enums.InputType

fun main(args: Array<String>) {

    OutputActor.requireInputNumericValue(InputType.NUMBER_TYPE)
    val numericValue = InputActor.getNumericValue()

    println(numericValue)
}