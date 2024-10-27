package mate.academy.service

import kotlin.random.Random
import mate.academy.model.Color
import mate.academy.model.Circle
import mate.academy.model.Figure
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square

const val FROM = 1.0
const val TO = 10.0
const val DEFAULT_RADIUS = 10.0

class FigureSupplier {
    private val figureTypes = listOf("Square", "Rectangle", "RightTriangle", "Circle", "IsoscelesTrapezoid")

    fun getRandomFigure(): Figure {
        val colorSupplier = ColorSupplier()
        return when (figureTypes.random()) {
            "Circle" -> Circle(Random.nextDouble(FROM, TO), colorSupplier.getRandomColor())
            "RightTriangle" -> RightTriangle(Random.nextDouble(FROM, TO), Random.nextDouble(FROM, TO),
                colorSupplier.getRandomColor())
            "Rectangle" -> Rectangle(Random.nextDouble(FROM, TO), Random.nextDouble(FROM, TO),
                colorSupplier.getRandomColor())
            "Square" -> Square(Random.nextDouble(FROM, TO), colorSupplier.getRandomColor())
            else -> IsoscelesTrapezoid(Random.nextDouble(FROM, TO), Random.nextDouble(FROM, TO),
                Random.nextDouble(FROM, TO), colorSupplier.getRandomColor())
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(DEFAULT_RADIUS, Color.WHITE)
    }
}
