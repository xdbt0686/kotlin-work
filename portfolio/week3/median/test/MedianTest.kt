// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    "Median of one element is that element" {
        median(listOf(-2.75f)) shouldBe (-2.75f plusOrMinus tolerance)
    }

    "Median of two elements preserves the fractional average" {
        median(listOf(9.0f, 2.0f)) shouldBe (5.5f plusOrMinus tolerance)
    }

    "Median of three unsorted elements is the middle sorted value" {
        median(listOf(11.0f, 2.0f, 4.0f)) shouldBe (4.0f plusOrMinus tolerance)
    }

    "Median of four unsorted elements averages only the middle pair" {
        median(listOf(20.0f, 8.0f, 1.0f, 3.0f)) shouldBe (5.5f plusOrMinus tolerance)
    }
})
