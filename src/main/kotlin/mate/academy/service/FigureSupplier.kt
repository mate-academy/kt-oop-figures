package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Figure
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.colorSupplier
import mate.academy.model.propertiesSupplier
import kotlin.random.Random

const val COUNT_TYPE_FIGURES = 5
const val ZERO = 0
const val ONE = 1
const val TWO = 2
const val THREE = 3
const val FOUR = 4
const val DEF_COLOUR = "white"
const val DEF_SIDE = 10.0

class FigureSupplier {
    fun getRandomFigure(): Figure {
        return when (Random.nextInt(COUNT_TYPE_FIGURES)) {
            ZERO -> Square(colorSupplier.getRandomColor().toString().lowercase(),
                propertiesSupplier.getRandomProperties())
            ONE -> Rectangle(colorSupplier.getRandomColor().toString().lowercase(),
                propertiesSupplier.getRandomProperties(),
                propertiesSupplier.getRandomProperties())
            TWO -> RightTriangle(colorSupplier.getRandomColor().toString().lowercase(),
                propertiesSupplier.getRandomProperties(),
                propertiesSupplier.getRandomProperties())
            THREE -> Circle(colorSupplier.getRandomColor().toString().lowercase(),
                propertiesSupplier.getRandomProperties())
            FOUR -> IsoscelesTrapezoid(colorSupplier.getRandomColor().toString().lowercase(),
                propertiesSupplier.getRandomProperties(),
                propertiesSupplier.getRandomProperties(),
                propertiesSupplier.getRandomProperties())
            else -> getRandomFigure()
        }
    }

    fun getDefaultFigure(): Figure = Circle(DEF_COLOUR, DEF_SIDE)
}
