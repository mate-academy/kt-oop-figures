package mate.academy.service

import kotlin.random.Random
import mate.academy.Shapes
import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.IsosceledTrapesoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square

const val BOUND_OF_SIZE:Double = 100.0
const val DEFAULT_CIRCLE_RADIUS:Double = 10.0
val DEFAULT_CIRCLE_COLOR: Color = Color.WHITE

class FigureSupplier {

    private val colorSupplier = ColorSupplier()
    private val random = Random

    fun getRandomFigure(): Figure {
        return when (Shapes.values().random()) {
           Shapes.CIRCLE -> Circle(
               random.nextDouble(BOUND_OF_SIZE),
               colorSupplier.getRandomColor()
           )
           Shapes.RECTANGLE -> Rectangle(
               colorSupplier.getRandomColor(),
               random.nextDouble(BOUND_OF_SIZE),
               random.nextDouble(BOUND_OF_SIZE)
           )
           Shapes.SQUARE -> Square(
               colorSupplier.getRandomColor(),
               random.nextDouble(BOUND_OF_SIZE)
           )
           Shapes.RIGHT_TRIANGLE -> RightTriangle(
               colorSupplier.getRandomColor(),
               random.nextDouble(BOUND_OF_SIZE),
               random.nextDouble(BOUND_OF_SIZE)
           )
           Shapes.ISOSCELES_TRAPEZOID -> IsosceledTrapesoid(
               colorSupplier.getRandomColor(),
               random.nextDouble(BOUND_OF_SIZE),
               random.nextDouble(BOUND_OF_SIZE),
               random.nextDouble(BOUND_OF_SIZE)
           )
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(
                DEFAULT_CIRCLE_RADIUS,
                DEFAULT_CIRCLE_COLOR
            )
    }
}
