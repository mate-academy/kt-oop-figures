package mate.academy.supplier

import mate.academy.model.model.Circle
import mate.academy.model.model.Figure
import mate.academy.model.model.IsoscelesTrapezoid
import mate.academy.model.model.Rectangle
import mate.academy.model.model.RightTriangle
import mate.academy.model.model.Square
import kotlin.random.Random

private const val MAX_SIZE: Double = 10.0
private const val MIX_SIZE: Double = 1.0
private const val DEFAULT_SIZE: Double = 10.0
private const val FIGURES_NUMBER = 5
private const val DEFAULT_COLOR = "WHITE"
private const val SQUARE_INDEX = 0
private const val RECTANGLE_INDEX = 1
private const val CIRCLE_INDEX = 2
private const val RIGHT_TRIANGLE_INDEX = 3


class FigureSupplier {

    private val colorSupplier = ColorSupplier()
    private val random = Random

    fun getRandomFigure(): Figure {
        return when (random.nextInt(FIGURES_NUMBER)) {

            SQUARE_INDEX -> Square(
                color = colorSupplier.getRandomColor(), side = random.nextDouble(MIX_SIZE, MAX_SIZE)
            )

            RECTANGLE_INDEX -> Rectangle(
                color = colorSupplier.getRandomColor(),
                firstSide = random.nextDouble(MIX_SIZE, MAX_SIZE),
                secondSide = random.nextDouble(MIX_SIZE, MAX_SIZE)
            )

            CIRCLE_INDEX -> Circle(
                color = colorSupplier.getRandomColor(),
                radius = random.nextDouble(MIX_SIZE,MAX_SIZE)
            )

            RIGHT_TRIANGLE_INDEX -> RightTriangle(
                color = colorSupplier.getRandomColor(),
                firstLeg = random.nextDouble(MIX_SIZE, MAX_SIZE),
                secondLeg = random.nextDouble(MIX_SIZE, MAX_SIZE)
            )

            else -> IsoscelesTrapezoid(
                color = colorSupplier.getRandomColor(),
                firstSide = random.nextDouble(MIX_SIZE, MAX_SIZE),
                secondSide = random.nextDouble(MIX_SIZE, MAX_SIZE),
                height = random.nextDouble(MIX_SIZE, MAX_SIZE)
            )
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(
            color = Color.valueOf(DEFAULT_COLOR), radius = DEFAULT_SIZE
        )
    }
}
