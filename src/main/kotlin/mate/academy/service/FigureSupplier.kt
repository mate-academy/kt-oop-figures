package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square
import kotlin.math.round
import kotlin.random.Random

private const val MAX_NUMBER = 30.0
private const val PRECISION_NUMBER = 100
private const val DEFAULT_RADIUS = 10.0
private val figuresList = Figure::class.sealedSubclasses

class FigureSupplier {
    val colorSupplier = ColorSupplier()

    /**
     * Generate figures with random properties
     */
    fun getRandomFigure(): Figure {
        val figure = figuresList.random().java
        return when (figure) {
            Square::class.java -> {
                Square(colorSupplier.getRandomColor(), getRandomDoubleWithPrecision())
            }

            Rectangle::class.java -> {
                Rectangle(
                    colorSupplier.getRandomColor(),
                    getRandomDoubleWithPrecision(),
                    getRandomDoubleWithPrecision()
                )
            }

            Circle::class.java -> {
                Circle(colorSupplier.getRandomColor(), getRandomDoubleWithPrecision())
            }

            RightTriangle::class.java -> {
                RightTriangle(
                    colorSupplier.getRandomColor(),
                    getRandomDoubleWithPrecision(),
                    getRandomDoubleWithPrecision()
                )
            }

            IsoscelesTrapezoid::class.java -> {
                IsoscelesTrapezoid(
                    colorSupplier.getRandomColor(),
                    getRandomDoubleWithPrecision(),
                    getRandomDoubleWithPrecision(),
                    getRandomDoubleWithPrecision()
                )
            }

            else -> {
                getDefaultFigure()
            }
        }
    }

    /**
     * This function always return a white circle with a radius 10
     */
    fun getDefaultFigure(): Figure = Circle(Color.WHITE, DEFAULT_RADIUS)
}

fun getRandomDoubleWithPrecision(): Double {
    return round(Random.nextDouble(MAX_NUMBER * PRECISION_NUMBER)) / PRECISION_NUMBER
}
