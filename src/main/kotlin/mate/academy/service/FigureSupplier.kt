package mate.academy.service

import mate.academy.model.Color
import mate.academy.model.figure.Figure
import mate.academy.model.figure.impl.Circle
import mate.academy.model.figure.impl.IsoscelesTrapezoid
import mate.academy.model.figure.impl.Rectangle
import mate.academy.model.figure.impl.RightTriangle
import mate.academy.model.figure.impl.Square
import kotlin.random.Random
import kotlin.random.nextInt

const val FIGURE_SUPPLIER_RANDOM_FROM = 1
const val FIGURE_SUPPLIER_RANDOM_TO = 5
const val FIGURE_SUPPLIER_DEFAULT_RADIUS = 10.0
const val ONE = 1
const val TWO = 2
const val THREE = 3
const val FOUR = 4
const val FIVE = 5
class FigureSupplier {
    val colorSupplier = ColorSupplier()

    fun getRandomFigure(): Figure {
        return when (Random.nextInt(FIGURE_SUPPLIER_RANDOM_FROM..FIGURE_SUPPLIER_RANDOM_TO)) {
            ONE -> Circle(colorSupplier.getRandomColor(),Random.nextDouble())
            TWO -> Square(colorSupplier.getRandomColor(),Random.nextDouble())
            THREE -> Rectangle(colorSupplier.getRandomColor(),Random.nextDouble(),Random.nextDouble())
            FOUR -> IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                Random.nextDouble(), Random.nextDouble(),Random.nextDouble())
            FIVE -> RightTriangle(colorSupplier.getRandomColor(),
                Random.nextDouble(),Random.nextDouble())

            else -> {
                Square(colorSupplier.getRandomColor(),Random.nextDouble())
            }
        }
    }

    fun getDefaultFigure(): Figure = Circle(Color.WHITE, FIGURE_SUPPLIER_DEFAULT_RADIUS)
}
