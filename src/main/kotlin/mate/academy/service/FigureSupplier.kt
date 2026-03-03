package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.FigureTypes
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square
import kotlin.math.round
import kotlin.random.Random

const val SIZE_LIMIT = 100
const val DEFAULT_RADIUS = 10

class FigureSupplier {
    val colorSupplier = ColorSupplier()

    fun getRandomFigure(): Figure {
        fun getRandomType(): FigureTypes {
            return FigureTypes.values()[Random.nextInt(FigureTypes.values().size)]
        }

        fun getRandomNumber(): Double {
            val number = Random.nextDouble(SIZE_LIMIT.toDouble())
            return round(number * SIZE_LIMIT) / SIZE_LIMIT
        }

        val figureType = getRandomType()

        return when (figureType) {
            FigureTypes.CIRCLE -> Circle(colorSupplier.getRandomColor(),
                getRandomNumber().toInt())
            FigureTypes.SQUARE -> Square(
                colorSupplier.getRandomColor(),
                getRandomNumber()
            )
            FigureTypes.ISOSCELESTRAPEZOID -> IsoscelesTrapezoid(
                colorSupplier.getRandomColor(),
                getRandomNumber(),
                getRandomNumber(),
                getRandomNumber()
            )
            FigureTypes.RECTANGLE -> Rectangle(
                colorSupplier.getRandomColor(),
                getRandomNumber(),
                getRandomNumber()
            )
            FigureTypes.RIGHTTRIANGLE -> RightTriangle(
                colorSupplier.getRandomColor(),
                getRandomNumber(),
                getRandomNumber(),
            )
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(Color.WHITE, DEFAULT_RADIUS)
    }
}
