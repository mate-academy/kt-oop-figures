package mate.academy.service

import mate.academy.figure.Circle
import mate.academy.figure.Figure
import mate.academy.figure.Rectangle
import mate.academy.figure.Square
import mate.academy.figure.IsoscelesTrapezoid
import mate.academy.figure.RightTriangle
import mate.academy.model.Color
import kotlin.random.Random

const val START_RANDOM_NUMBER = 1
const val FINISH_RANDOM_NUMBER = 20
const val DEFAULT_RADIUS = 10.0
enum class FigureType {
    SQUARE,
    CIRCLE,
    RECTANGLE,
    RIGHT_TRIANGLE,
    ISOSCELES_TRIANGLE
}

class FigureSupplier {
    private val color: ColorSupplier = ColorSupplier()
    val randomValue: () -> Double = {
        Random.nextInt(START_RANDOM_NUMBER, FINISH_RANDOM_NUMBER).toDouble()}

    fun getDefaultFigure(): Figure {
        return Circle(Color.WHITE, DEFAULT_RADIUS)
    }

    fun getRandomFigure(): Figure {
        return when (FigureType.values().random()) {
            FigureType.CIRCLE -> Circle(color.getRandomColor(), randomValue())
            FigureType.SQUARE -> Square(color.getRandomColor(), randomValue())
            FigureType.RECTANGLE -> Rectangle(color.getRandomColor(), randomValue(), randomValue())
            FigureType.RIGHT_TRIANGLE -> RightTriangle(color.getRandomColor(),
                randomValue(), randomValue())
            FigureType.ISOSCELES_TRIANGLE -> IsoscelesTrapezoid(color.getRandomColor()
                , randomValue(), randomValue(), randomValue())
        }
    }
}
