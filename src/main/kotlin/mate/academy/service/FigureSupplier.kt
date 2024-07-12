package mate.academy.service

import mate.academy.figure.Circle
import mate.academy.figure.Figure
import mate.academy.figure.Rectangle
import mate.academy.figure.RightTriangle
import mate.academy.figure.Square
import mate.academy.figure.IsoscelesTrapezoid
import mate.academy.model.Color
import kotlin.math.floor
import kotlin.random.Random

const val DEFAULT_RADIUS : Double = 10.0
const val FIGURES_NUMBER = 5
const val FLOOR_NUMBER = 10.0

private const val MULTIPLIER = 100

class FigureSupplier {
    fun getRandomFigure() {
        val randomValue = floor(Random.nextDouble() * MULTIPLIER * FLOOR_NUMBER) / FLOOR_NUMBER
        val randomColor = ColorSupplier().getRandomColor()

        when (Random.nextInt(FIGURES_NUMBER)) {
            1 -> Circle(randomValue, ColorSupplier().getRandomColor()).draw()
            2 -> Rectangle(randomValue, randomValue, ColorSupplier().getRandomColor()).draw()
            3 -> RightTriangle(randomValue, randomValue, randomColor).draw()
            4 -> Square(randomValue, randomColor).draw()
            else -> IsoscelesTrapezoid(randomValue, randomValue, randomValue, randomColor).draw()
        }
    }

    fun getDefaultFigure() {
        return Circle(DEFAULT_RADIUS, Color.WHITE).draw()
    }
}
