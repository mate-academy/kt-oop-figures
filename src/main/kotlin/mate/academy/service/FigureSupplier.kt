package mate.academy.service

import mate.academy.figure.Circle
import mate.academy.figure.Figure
import mate.academy.figure.Rectangle
import mate.academy.figure.Square
import mate.academy.figure.IsoscelesTrapezoid
import mate.academy.figure.RightTriangle
import mate.academy.model.Color
import kotlin.random.Random

const val START_RANDOM_NUMBER = 1.0
const val FINISH_RANDOM_NUMBER = 20.0
const val DEFAULT_RADIUS = 10.0
const val QUANTITY_FIGURES = 5
const val ROUND_NUMBER = 10
const val ROUND_NUMBER2 = 10.0
const val ISOSCELES_TRIANGLE = 4
const val RIGHT_TRIANGLE = 3
const val RECTANGLE = 2
const val SQUARE = 1
const val CIRCLE = 0

class FigureSupplier: ColorSupplier() {
    val randomValue: () -> Double = {
        val  value = Random.nextDouble(START_RANDOM_NUMBER, FINISH_RANDOM_NUMBER)
        Math.round(value * ROUND_NUMBER) / ROUND_NUMBER2
    }

    fun getDefaultFigure(): Figure {
        return Circle(Color.WHITE, DEFAULT_RADIUS)
    }

    fun getRandomFigure(): Figure {
        return when (Random.nextInt(QUANTITY_FIGURES)) {
            CIRCLE -> Circle(getRandomColor(), randomValue())
            SQUARE -> Square(getRandomColor(), randomValue())
            RECTANGLE -> Rectangle(getRandomColor(), randomValue(), randomValue())
            RIGHT_TRIANGLE -> RightTriangle(getRandomColor(), randomValue(), randomValue())
            ISOSCELES_TRIANGLE -> IsoscelesTrapezoid(getRandomColor(), randomValue(), randomValue(), randomValue())
            else -> throw IllegalArgumentException("Unknown figure type")
        }
    }
}
