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

const val DEFAULT_RADIUS = 10.0

class FigureSupplier {
    private val random = Random.Default
    private val colorSupplier = ColorSupplier()

    fun getRandomFigure(): Figure {
        val randomColor = colorSupplier.getRandomColor()
        val randomFigureType = FigureType.values()[Random.nextInt(FigureType.values().size)]

        return when(randomFigureType) {
            FigureType.CIRCLE
                -> Circle(randomColor, random.nextDouble())
            FigureType.ISOSCELES_TRAPEZOID
                -> IsoscelesTrapezoid(
                randomColor, random.nextDouble(), random.nextDouble(), random.nextDouble())
            FigureType.RECTANGLE
                -> Rectangle(randomColor, random.nextDouble(), random.nextDouble())
            FigureType.RIGHT_TRIANGLE
                -> RightTriangle(randomColor, random.nextDouble(), random.nextDouble())
            FigureType.SQUARE
                -> Square(randomColor, random.nextDouble())
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(Color.WHITE, DEFAULT_RADIUS)
    }
}
