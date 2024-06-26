package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square

private const val MIN_LENGTH = 1
private const val MAX_LENGTH = 10
private const val DEFAULT_RADIUS = 10

class FigureSupplier {
    private val figureTypes = arrayOf(
        "square",
        "rectangle",
        "right triangle",
        "circle",
        "isosceles trapezoid"
    )
    private var colorSupplier = ColorSupplier()

    fun getRandomFigure(): Figure {
        val color = colorSupplier.getRandomColor()
        fun randomLength(): Int = (MIN_LENGTH..MAX_LENGTH).random()
        return when (figureTypes.random()) {
            "square" -> Square(color, randomLength())
            "rectangle" -> Rectangle(color, randomLength(), randomLength())
            "right triangle" -> RightTriangle(color, randomLength(), randomLength())
            "circle" -> Circle(color, randomLength())
            else -> IsoscelesTrapezoid(color, randomLength(), randomLength(), randomLength())
        }
    }

    fun getDefaultFigure(): Figure = Circle(Color.WHITE, DEFAULT_RADIUS)
}
