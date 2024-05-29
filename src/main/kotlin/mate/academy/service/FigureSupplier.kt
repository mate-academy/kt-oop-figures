package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square
import kotlin.random.Random

const val MAX_RADIUS_LIMIT = 10.0
const val MAX_BASE_LIMIT = 20.0
const val MAX_HEIGHT_LIMIT = 15.0

class FigureSupplier {
    private val colorSupplier = ColorSupplier()

    fun getRandomFigure(): Figure {
        val randomFigure = FIGURES.values().random()
        return when (randomFigure) {
            FIGURES.CIRCLE -> Circle(colorSupplier.getRandomColor(), Random.nextDouble(MAX_RADIUS_LIMIT))

            FIGURES.ISOSCELESTRAPEZOID -> IsoscelesTrapezoid(
                colorSupplier.getRandomColor(),
                Random.nextDouble(MAX_BASE_LIMIT),
                Random.nextDouble(MAX_BASE_LIMIT),
                Random.nextDouble(MAX_HEIGHT_LIMIT)
            )

            FIGURES.RECTANGLE -> Rectangle(
                colorSupplier.getRandomColor(),
                Random.nextDouble(MAX_BASE_LIMIT),
                Random.nextDouble(MAX_BASE_LIMIT)
            )

            FIGURES.RIGHTTRIANGLE -> RightTriangle(
                colorSupplier.getRandomColor(),
                Random.nextDouble(MAX_BASE_LIMIT),
                Random.nextDouble(MAX_BASE_LIMIT)
            )

            FIGURES.SQUARE -> Square(colorSupplier.getRandomColor(), Random.nextDouble(MAX_BASE_LIMIT))
        }
    }

    fun getDefaultFigure(): Figure = Circle(color = Color.WHITE, radius = 10.0)

    enum class FIGURES {
        CIRCLE,
        ISOSCELESTRAPEZOID,
        RECTANGLE,
        RIGHTTRIANGLE,
        SQUARE
    }
}
