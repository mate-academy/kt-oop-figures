package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.FigureType
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square
import kotlin.random.Random

private const val BOUND_VALUE = 100.0
private const val DEFAULT_RADIUS = 10.0

class FigureSupplier {
    private val colorSupplier = ColorSupplier()

    fun getRandomFigure(): Figure {


        return when (FigureType.values().random()) {
            FigureType.CIRCLE -> createCircle()
            FigureType.SQUARE -> createSquare()
            FigureType.RECTANGLE -> createRectangle()
            FigureType.RIGHT_TRIANGLE -> createRightTriangle()
            FigureType.ISOSCELES_TRAPEZOID -> createIsoscelesTrapezoid()
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(DEFAULT_RADIUS, Color.WHITE)
    }

    fun createCircle(): Circle = Circle(Random.nextDouble(BOUND_VALUE), colorSupplier.getRandomColor())

    fun createSquare(): Square = Square(Random.nextDouble(BOUND_VALUE), colorSupplier.getRandomColor())

    fun createRectangle(): Rectangle = Rectangle(
        Random.nextDouble(BOUND_VALUE)
        , Random.nextDouble(BOUND_VALUE)
        , colorSupplier.getRandomColor()
    )

    fun createRightTriangle(): RightTriangle = RightTriangle(
        Random.nextDouble(BOUND_VALUE)
        , Random.nextDouble(BOUND_VALUE)
        , colorSupplier.getRandomColor()
    )

    fun createIsoscelesTrapezoid(): IsoscelesTrapezoid = IsoscelesTrapezoid(
        Random.nextDouble(BOUND_VALUE),
        Random.nextDouble(BOUND_VALUE),
        Random.nextDouble(BOUND_VALUE),
        colorSupplier.getRandomColor()
    )
}
