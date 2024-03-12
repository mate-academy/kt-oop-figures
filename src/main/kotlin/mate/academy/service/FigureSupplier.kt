package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.Figures
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square

import kotlin.random.Random.Default.nextInt

const val MAX_SIZE: Int = 15
const val MIN_SIZE: Int = 1
const val DEFAULT_SIZE: Int = 10

class FigureSupplier {
    val colorSupplier: ColorSupplier = ColorSupplier()

    fun getDefaultFigure(): Figure {
        return Circle(Color.WHITE, DEFAULT_SIZE)
    }

    fun getRandomFigure(): Figure {
        return when (Figures.values().random()) {
            Figures.CIRCLE -> Circle(
                colorSupplier.getRandomColor(),
                nextInt(MIN_SIZE, MAX_SIZE)
            )

            Figures.RIGHT_TRIANGLE -> RightTriangle(
                colorSupplier.getRandomColor(),
                nextInt(MIN_SIZE, MAX_SIZE),
                nextInt(MIN_SIZE, MAX_SIZE)
            )

            Figures.ISOSCELES_TRAPEZOID -> IsoscelesTrapezoid(
                colorSupplier.getRandomColor(),
                nextInt(MIN_SIZE, MAX_SIZE),
                nextInt(MIN_SIZE, MAX_SIZE),
                nextInt(MIN_SIZE, MAX_SIZE)
            )

            Figures.RECTANGLE -> Rectangle(
                colorSupplier.getRandomColor(),
                nextInt(MIN_SIZE, MAX_SIZE),
                nextInt(MIN_SIZE, MAX_SIZE)
            )

            Figures.SQUARE -> Square(
                colorSupplier.getRandomColor(),
                nextInt(MIN_SIZE, MAX_SIZE)
            )
        }
    }
}
