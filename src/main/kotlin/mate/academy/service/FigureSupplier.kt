package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square
import kotlin.random.Random

const val BOUND_VALUE = 100.0
const val DEFAULT_RADIUS = 10.0

class FigureSupplier {
    fun getRandomFigure(): Figure {
        val colorSupplier = ColorSupplier()

        val figureClasses = listOf(
            Circle::class, Square::class, Rectangle::class
            , RightTriangle::class, IsoscelesTrapezoid::class)

        return  when (figureClasses[Random.nextInt(figureClasses.size)]) {
            Circle::class -> Circle(Random.nextDouble(BOUND_VALUE), colorSupplier.getRandomColor())
            Square::class -> Square(Random.nextDouble(BOUND_VALUE), colorSupplier.getRandomColor())
            Rectangle::class -> Rectangle(
                Random.nextDouble(BOUND_VALUE)
                , Random.nextDouble(BOUND_VALUE), colorSupplier.getRandomColor()
            )
            RightTriangle::class -> RightTriangle(
                Random.nextDouble(BOUND_VALUE)
                , Random.nextDouble(BOUND_VALUE), colorSupplier.getRandomColor()
            )
            IsoscelesTrapezoid::class -> IsoscelesTrapezoid(
                Random.nextDouble(BOUND_VALUE),
                Random.nextDouble(BOUND_VALUE),
                Random.nextDouble(BOUND_VALUE),
                colorSupplier.getRandomColor()
            )
            else -> throw IllegalArgumentException("Unknown figure class")
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(DEFAULT_RADIUS, Color.WHITE)
    }
}
