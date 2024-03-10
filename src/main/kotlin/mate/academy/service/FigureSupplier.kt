package mate.academy.service

import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.impl.Circle
import mate.academy.model.impl.IsoscelesTrapezoid
import mate.academy.model.impl.Rectangle
import mate.academy.model.impl.RightTriangle
import mate.academy.model.impl.Square
import kotlin.random.Random

private const val CIRCLE_NUMBER = 1
private const val RECTANGLE_NUMBER = 2
private const val RIGHT_TRIANGLE_NUMBER = 3
private const val SQUARE_NUMBER = 4
private const val NUMBERS_OF_FIGURE = 5
private const val RANDOM_MAX_VALUE = 100.0
private const val DEFAULT_CIRCLE_RADIUS = 10.0

class FigureSupplier {
    fun getRandomFigure(): Figure {
        val randomColor = ColorSupplier().getRandomColor()
        return when(Random.nextInt(NUMBERS_OF_FIGURE) + 1) {
            CIRCLE_NUMBER -> Circle(Random.nextDouble(RANDOM_MAX_VALUE),
                                    randomColor)
            RECTANGLE_NUMBER -> Rectangle(Random.nextDouble(RANDOM_MAX_VALUE),
                                          Random.nextDouble(RANDOM_MAX_VALUE),
                                          randomColor)
            RIGHT_TRIANGLE_NUMBER -> RightTriangle(Random.nextDouble(RANDOM_MAX_VALUE),
                                                   Random.nextDouble(RANDOM_MAX_VALUE),
                                                   randomColor)
            SQUARE_NUMBER -> Square(Random.nextDouble(RANDOM_MAX_VALUE),
                                                      randomColor)
            else -> IsoscelesTrapezoid(Random.nextDouble(RANDOM_MAX_VALUE),
                                       Random.nextDouble(RANDOM_MAX_VALUE),
                                       Random.nextDouble(RANDOM_MAX_VALUE),
                                       randomColor)
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(DEFAULT_CIRCLE_RADIUS, Color.WHITE)
    }
}
