package mate.academy.service

import mate.academy.model.*
import kotlin.math.round
import kotlin.random.Random

const val MAX_NUMBER = 30.0
const val PRECISION_NUMBER = 100
const val DEFAULT_RADIUS = 10.0
val figuresList = Figure::class.sealedSubclasses

class FigureSupplier {
    val colorSupplier = ColorSupplier()

    /**
     * Generate figures with random properties
     */
    fun getRandomFigure(): Figure {
        val figure = figuresList.random().java

        return when (figure) {
            Square::class.java -> {
                Square(colorSupplier.getRandomColor(), getRundomDoubleWithPrecision())
            }

            Rectangle::class.java -> {
                Rectangle(
                    colorSupplier.getRandomColor(),
                    getRundomDoubleWithPrecision(),
                    getRundomDoubleWithPrecision()
                )
            }

            Circle::class.java -> {
                Circle(colorSupplier.getRandomColor(), getRundomDoubleWithPrecision())
            }

            RightTriangle::class.java -> {
                RightTriangle(
                    colorSupplier.getRandomColor(),
                    getRundomDoubleWithPrecision(),
                    getRundomDoubleWithPrecision()
                )
            }

            IsoscelesTrapezoid::class.java -> {
                IsoscelesTrapezoid(
                    colorSupplier.getRandomColor(),
                    getRundomDoubleWithPrecision(),
                    getRundomDoubleWithPrecision(),
                    getRundomDoubleWithPrecision()
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

fun getRundomDoubleWithPrecision(): Double = round(Random.nextDouble(MAX_NUMBER * PRECISION_NUMBER)) / PRECISION_NUMBER;