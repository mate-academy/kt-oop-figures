package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square
import kotlin.random.Random

private const val MIN_RANDOM_VALUE = 1
private const val MAX_RANDOM_VALUE_EXCLUSIVE = 11
private const val FIGURE_TYPES_COUNT = 5
private const val DEFAULT_RADIUS = 10.0

private const val SQUARE_INDEX = 0
private const val RECTANGLE_INDEX = 1
private const val TRIANGLE_INDEX = 2
private const val CIRCLE_INDEX = 3

class ColorSupplier {
    fun getRandomColor(): Color {
        return Color.values()[Random.nextInt(Color.values().size)]
    }
}

class FigureSupplier {
    private val colorSupplier = ColorSupplier()

    fun getRandomFigure(): Figure {
        val color = colorSupplier.getRandomColor()
        val randomVal = { Random.nextInt(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE_EXCLUSIVE).toDouble() }

        return when (Random.nextInt(FIGURE_TYPES_COUNT)) {
            SQUARE_INDEX -> Square(randomVal(), color)
            RECTANGLE_INDEX -> Rectangle(randomVal(), randomVal(), color)
            TRIANGLE_INDEX -> RightTriangle(randomVal(), randomVal(), color)
            CIRCLE_INDEX -> Circle(randomVal(), color)
            else -> IsoscelesTrapezoid(randomVal(), randomVal(), randomVal(), color)
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(DEFAULT_RADIUS, Color.WHITE)
    }
}
