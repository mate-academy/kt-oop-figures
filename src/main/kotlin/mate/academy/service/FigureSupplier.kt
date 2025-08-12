package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.Square
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.IsoscelesTrapezoid
import kotlin.random.Random

const val MAX_RANDOM_VALUE = 100.00
const val DEFAULT_RADIUS = 10.0
class FigureSupplier(private var colorSupplier: ColorSupplier) {
    fun getRandomFigure(): Figure {
        fun getRandomLength(): Double {
            return Random.nextDouble(0.00, MAX_RANDOM_VALUE)
        }

        fun getRandomColor(): Color {
            return colorSupplier.getRandomColor()
        }

        val factories = listOf(
            { Square(getRandomColor(), getRandomLength()) },
            { Circle(getRandomColor(), getRandomLength()) },
            { Rectangle(getRandomColor(), getRandomLength(), getRandomLength()) },
            { RightTriangle(getRandomColor(), getRandomLength(), getRandomLength()) },
            { IsoscelesTrapezoid(getRandomColor(), getRandomLength(), getRandomLength(), getRandomLength()) }
        )

        return factories.random().invoke()
    }

    fun getDefaultFigure() : Figure{
        return Circle(Color.WHITE, DEFAULT_RADIUS)
    }
}
