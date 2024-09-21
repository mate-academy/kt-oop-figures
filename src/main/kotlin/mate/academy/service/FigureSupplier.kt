package mate.academy.service

import mate.academy.model.*
import java.math.BigDecimal
import java.math.RoundingMode
import kotlin.random.Random

private const val WHITE = "white"

private const val DEFAULT_RADIUS = 10.0

private const val DEFAULT_RANGE = 100.0

private const val DEFAULT_SCALE = 2

class FigureSupplier {
    val colorSupplier: ColorSupplier = ColorSupplier()
    fun getRandomFigure(): Figure {
        val randomFigure : FigureEnum = FigureEnum.values()[Random.nextInt(FigureEnum.values().size)]
        val firstRandomNumber = BigDecimal(Random.nextDouble(DEFAULT_RANGE)).setScale(DEFAULT_SCALE, RoundingMode.HALF_EVEN).toDouble()
        val secondRandomNumber = BigDecimal(Random.nextDouble(DEFAULT_RANGE)).setScale(DEFAULT_SCALE, RoundingMode.HALF_EVEN).toDouble()

        return when (randomFigure) {
            FigureEnum.CIRCLE -> Circle(colorSupplier.getRandomColor().toString().lowercase(), firstRandomNumber)
            FigureEnum.ISOSCELES_TRAPEZOID -> IsoscelesTrapezoid(colorSupplier.getRandomColor().toString().lowercase(),
                firstRandomNumber, secondRandomNumber)
            FigureEnum.RECTANGLE -> Rectangle(colorSupplier.getRandomColor().toString().lowercase(),
                firstRandomNumber, secondRandomNumber)
            FigureEnum.RIGHT_TRIANGLE -> RightTriangle(colorSupplier.getRandomColor().toString().lowercase(),
                firstRandomNumber)
            FigureEnum.SQUARE -> Circle(colorSupplier.getRandomColor().toString().lowercase(),
                firstRandomNumber)
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(WHITE, DEFAULT_RADIUS)
    }
}