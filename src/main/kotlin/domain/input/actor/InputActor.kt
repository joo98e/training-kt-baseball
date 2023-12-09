package org.example.domain.input.actor

import org.example.domain.util.validate.CustomValidator

class InputActor {
    companion object {
        fun getNumericValue(): Int {
            val readLine: String = readlnOrNull() ?: ""
            return if (CustomValidator.isNumeric(readLine)) readLine.toInt() else throw IllegalArgumentException()
        }
    }
}