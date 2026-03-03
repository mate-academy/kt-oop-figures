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

const val SIZELIMIT = 100
const val DEFOULTRADIUS = 10

class FigureSupplier {
    fun getRandomFigure(): Figure {
        fun getRandomType(): FigureTypes {
            return FigureTypes.values()[Random.nextInt(FigureTypes.values().size)]
        }

        fun getRandomNumber(): Double {
            val number = Random.nextDouble(SIZELIMIT.toDouble())
            return round(number * SIZELIMIT) / SIZELIMIT
        }

        val colorSupplier = ColorSupplier()
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
                getRandomNumber()
            )
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(Color.WHITE, DEFOULTRADIUS)
    }
}