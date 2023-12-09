package domain.util.validate

import io.kotest.assertions.throwables.shouldNotThrow
import io.kotest.matchers.shouldBe
import org.example.domain.util.validate.CustomValidator
import org.junit.jupiter.api.Test


class CustomValidatorTest() {
    @Test
    fun `Validator 는 String 을 받아 Number 인지 확인한다`() {
        // given
        val sut: String = "5"

        // when
        val numeric = CustomValidator.isNumeric(sut)

        // then
        numeric shouldBe true
    }

    @Test
    fun `Validator 는 숫자가 아닌 값이 들어와도 Exception 이 아닌 Boolean 값을 내보낸다`() {
        // given
        val sut = "String"

        // when & then
        shouldNotThrow<NumberFormatException> {
            val result = CustomValidator.isNumeric(sut)
            result shouldBe false
        }
    }
}