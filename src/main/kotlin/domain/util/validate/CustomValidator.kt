package org.example.domain.util.validate

class CustomValidator {
    companion object {
        fun isNumeric(value: String): Boolean {
            try {
                value.toInt()
                return true
            } catch (e: NumberFormatException) {
                return false
            }
        }
    }
}