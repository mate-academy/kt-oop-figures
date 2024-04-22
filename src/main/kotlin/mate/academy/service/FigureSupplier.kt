package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square
import kotlin.random.Random

const val NUMBER_OF_FIGURE_TYPES = 5
const val DEFAULT_RADIUS = 10.0
const val INDEX_OF_CIRCLE = 0
const val INDEX_OF_ISOSCELES_TRAPEZOID = 1
const val INDEX_OF_RECTANGLE = 2
const val INDEX_OF_RIGHT_TRIANGLE = 3

class FigureSupplier {
    private val random = Random.Default
    private val colorSupplier = ColorSupplier()

    fun getRandomFigure(): Figure {
        val randomColor = colorSupplier.getRandomColor()

        return when(random.nextInt(NUMBER_OF_FIGURE_TYPES)) {
            INDEX_OF_CIRCLE
                -> Circle(randomColor, random.nextDouble())
            INDEX_OF_ISOSCELES_TRAPEZOID
                -> IsoscelesTrapezoid(
                randomColor, random.nextDouble(), random.nextDouble(), random.nextDouble())
            INDEX_OF_RECTANGLE
                -> Rectangle(randomColor, random.nextDouble(), random.nextDouble())
            INDEX_OF_RIGHT_TRIANGLE
                -> RightTriangle(randomColor, random.nextDouble(), random.nextDouble())
            else -> Square(randomColor, random.nextDouble())
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(Color.WHITE, DEFAULT_RADIUS)
    }
}
