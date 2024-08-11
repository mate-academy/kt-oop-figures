package mate.academy.supplier

import mate.academy.model.model.*
import kotlin.random.Random

private const val MAX_SIZE: Double = 10.0
private const val MIX_SIZE: Double = 1.0
private const val DEFAULT_SIZE: Double = 10.0
private const val FIGURES_NUMBER = 5
private const val DEFAULT_COLOR = "WHITE"

class FigureSupplier {

    private val colorSupplier = ColorSupplier()
    private val random = Random

    fun getRandomFigure(): Figure {
        return when (random.nextInt(FIGURES_NUMBER)) {

            0 -> Square(
                color = colorSupplier.getRandomColor(), side = random.nextDouble(MIX_SIZE, MAX_SIZE)
            )

            1 -> Rectangle(
                color = colorSupplier.getRandomColor(),
                firstSide = random.nextDouble(MIX_SIZE, MAX_SIZE),
                secondSide = random.nextDouble(MIX_SIZE, MAX_SIZE)
            )

            2 -> Circle(
                color = colorSupplier.getRandomColor(),
                radius = random.nextDouble(MAX_SIZE)
            )

            3 -> RightTriangle(
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
