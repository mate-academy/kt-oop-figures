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
    private var colorSupplier = ColorSupplier()

    fun getRandomFigure(): Figure {
        val color = colorSupplier.getRandomColor()
        fun randomLength(): Int = (MIN_LENGTH..MAX_LENGTH).random()
        return when (Type.values().random()) {
            Type.SQUARE -> Square(color, randomLength())
            Type.RECTANGLE -> Rectangle(color, randomLength(), randomLength())
            Type.RIGHT_TRIANGLE -> RightTriangle(color, randomLength(), randomLength())
            Type.CIRCLE -> Circle(color, randomLength())
            else -> IsoscelesTrapezoid(color, randomLength(), randomLength(), randomLength())
        }
    }

    fun getDefaultFigure(): Figure = Circle(Color.WHITE, DEFAULT_RADIUS)

    enum class Type {
        SQUARE,
        RECTANGLE,
        RIGHT_TRIANGLE,
        CIRCLE,
        ISOSCELES_TRAPEZOID
    }
}
