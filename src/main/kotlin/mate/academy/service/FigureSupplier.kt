package mate.academy.service

import mate.academy.figure.Circle
import mate.academy.figure.Rectangle
import mate.academy.figure.RightTriangle
import mate.academy.figure.Square
import mate.academy.figure.IsoscelesTrapezoid
import mate.academy.model.Color
import mate.academy.model.Shape
import kotlin.math.floor
import kotlin.random.Random

const val DEFAULT_RADIUS : Double = 10.0
const val HALF_MULTIPLIER = 0.5
const val FLOOR_NUMBER = 10.0
const val MULTIPLIER = 100

class FigureSupplier {
    fun getRandomFigure() {
        val randomValue = floor(Random.nextDouble() * MULTIPLIER * FLOOR_NUMBER) / FLOOR_NUMBER
        val randomColor = ColorSupplier().getRandomColor()

        when (Shape.values().random()) {
            Shape.CIRCLE -> Circle(randomValue, ColorSupplier().getRandomColor()).draw()
            Shape.RECTANGLE -> Rectangle(randomValue, randomValue, ColorSupplier().getRandomColor()).draw()
            Shape.RIGHT_TRIANGLE -> RightTriangle(randomValue, randomValue, randomColor).draw()
            Shape.SQUARE -> Square(randomValue, randomColor).draw()
            else -> IsoscelesTrapezoid(randomValue, randomValue, randomValue, randomColor).draw()
        }
    }

    fun getDefaultFigure() {
        return Circle(DEFAULT_RADIUS, Color.WHITE).draw()
    }
}
