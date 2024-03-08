package mate.academy.service

import kotlin.math.round
import kotlin.random.Random
import mate.academy.model.enums.AvailableFigures
import mate.academy.model.enums.Color
import mate.academy.model.figure.Circle
import mate.academy.model.figure.Figure
import mate.academy.model.figure.IsoscelesTrapezoid
import mate.academy.model.figure.Rectangle
import mate.academy.model.figure.RightTriangle
import mate.academy.model.figure.Square

const val DEFAULT_RADIUS: Double = 10.0
const val MINIMUM_LENGTH: Double = 1.0
const val MAXIMUM_LENGTH: Double = 100.0
val DEFAULT_COLOR: Color = Color.WHITE

class FigureSupplier {

    private val colorSupplier: ColorSupplier = ColorSupplier()
    fun getRandomFigure(): Figure {
        return when (AvailableFigures.values()[Random.nextInt(AvailableFigures.values().size - 1)]) {
            AvailableFigures.SQUARE -> generateRandomSquare()
            AvailableFigures.RECTANGLE -> generateRandomRectangle()
            AvailableFigures.CIRCLE -> generateRandomCircle()
            AvailableFigures.RIGHT_TRIANGLE -> generateRandomRightTriangle()
            AvailableFigures.ISOSCELES_TRAPEZOID -> generateRandomIsoscelesTrapezoid()
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(DEFAULT_RADIUS, DEFAULT_COLOR)
    }

    private fun generateRandomSquare(): Figure {
        val color: Color = colorSupplier.getRandomColor()
        val side: Double = round(Random.nextDouble(MINIMUM_LENGTH, MAXIMUM_LENGTH))
        return Square(side, color)
    }

    private fun generateRandomRectangle(): Figure {
        val color: Color = colorSupplier.getRandomColor()
        val height: Double = round(Random.nextDouble(MINIMUM_LENGTH, MAXIMUM_LENGTH))
        var width: Double = round(Random.nextDouble(MINIMUM_LENGTH, MAXIMUM_LENGTH))
        while (width == height) {
            width = round(Random.nextDouble(MINIMUM_LENGTH, MAXIMUM_LENGTH))
        }
        return Rectangle(height, width, color)
    }

    private fun generateRandomCircle(): Figure {
        val color: Color = colorSupplier.getRandomColor()
        val radius: Double = round(Random.nextDouble(MINIMUM_LENGTH, MAXIMUM_LENGTH))
        return Circle(radius, color)
    }

    private fun generateRandomRightTriangle(): Figure {
        val color: Color = colorSupplier.getRandomColor()
        val firstLeg: Double = round(Random.nextDouble(MINIMUM_LENGTH, MAXIMUM_LENGTH))
        val secondLeg: Double = round(Random.nextDouble(MINIMUM_LENGTH, MAXIMUM_LENGTH))
        return RightTriangle(firstLeg, secondLeg, color)
    }

    private fun generateRandomIsoscelesTrapezoid(): Figure {
        val color: Color = colorSupplier.getRandomColor()
        val leg: Double = round(Random.nextDouble(MINIMUM_LENGTH, MAXIMUM_LENGTH))
        val shortBase: Double = round(Random.nextDouble(MINIMUM_LENGTH, MAXIMUM_LENGTH))
        var longBase: Double = round(Random.nextDouble(MINIMUM_LENGTH, MAXIMUM_LENGTH))
        while (shortBase >= longBase) {
            longBase = round(Random.nextDouble(MINIMUM_LENGTH, MAXIMUM_LENGTH))
        }
        return IsoscelesTrapezoid(shortBase, longBase, leg, color)
    }
}