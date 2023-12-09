package org.example.domain.output.actor

import org.example.domain.output.enums.InputType

class OutputActor {

    companion object {
        private const val GET_STRING_MESSAGE = "문자열로 입력하세요."
        private const val GET_NUMERIC_MESSAGE = "숫자로 입력하세요."

        fun requireInputNumericValue(inputType: InputType) {
            val message: String? = when (inputType) {
                InputType.STRING_TYPE -> GET_STRING_MESSAGE
                InputType.NUMBER_TYPE -> GET_NUMERIC_MESSAGE
            }
            println(message)
        }
    }
}