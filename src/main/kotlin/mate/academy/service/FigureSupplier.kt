package mate.academy.service

import mate.academy.model.Figure
import mate.academy.model.Circle
import mate.academy.model.Square
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Color

import kotlin.random.Random

const val MAX_VALUE = 100.0
const val CIRCLE_RADIUS = 5.0

class FigureSupplier(val colorSupplier: ColorSupplier) {
    fun getDefaultFigure(): Figure {
        val defaultColor = Color.WHITE
        return Circle(defaultColor, CIRCLE_RADIUS)
    }

    fun getRandomFigure(): Figure {
        val random = Random
        fun getRandomDouble(): Double = random.nextDouble(MAX_VALUE)
        val figureType: FigureType = FigureType.values()[random.nextInt(FigureType.values().size)]
        return when (figureType) {
            FigureType.SQUARE -> Square(colorSupplier.getRandomColor(), getRandomDouble())
            FigureType.CIRCLE -> Circle(colorSupplier.getRandomColor(), getRandomDouble())
            FigureType.RECTANGLE -> Rectangle(colorSupplier.getRandomColor(), getRandomDouble(), getRandomDouble())
            FigureType.RIGHT_TRIANGLE -> RightTriangle(
                colorSupplier.getRandomColor(),
                getRandomDouble(),
                getRandomDouble()
            )

            FigureType.ISOSCELES_TRAPEZOID -> IsoscelesTrapezoid(
                colorSupplier.getRandomColor(),
                getRandomDouble(),
                getRandomDouble(),
                getRandomDouble()
            )
        }

    }


    enum class FigureType {
        SQUARE,
        RECTANGLE,
        RIGHT_TRIANGLE,
        CIRCLE,
        ISOSCELES_TRAPEZOID
    }
}
