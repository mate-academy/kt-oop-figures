package mate.academy.service


import mate.academy.model.Circle
import mate.academy.model.Figure
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightRectangle
import mate.academy.model.Square
import kotlin.random.Random

const val NUMBER_OF_FIGURES = 6
const val ONE = 1
const val TWO = 2
const val THREE = 3
const val FOUR = 4
const val FIVE = 5
const val MIN = 10.00
const val MAX = 20.00
const val DEFAULT_RADIUS = 10.00

class FigureSupplier {
    private val supplier = ColorSupplier()

    fun getRandomFigure(): Figure {
        return when((ONE..NUMBER_OF_FIGURES).random()) {
            ONE -> Circle(Random.nextDouble(MIN, MAX) ,supplier.getRandomColor())
            TWO -> IsoscelesTrapezoid(Random.nextDouble(MIN, MAX), Random.nextDouble(MIN, MAX),
                    Random.nextDouble(MIN, MAX), supplier.getRandomColor())
            THREE -> Rectangle(Random.nextDouble(MIN, MAX),
                    Random.nextDouble(MIN, MAX), supplier.getRandomColor())
            FOUR -> RightRectangle(Random.nextDouble(MIN, MAX), Random.nextDouble(MIN, MAX),
                    supplier.getRandomColor())
            FIVE -> Square(Random.nextDouble(MIN, MAX), supplier.getRandomColor())
            else -> getDefaultFigure()
        }
    }

    private fun getDefaultFigure(): Figure {
        return Circle(DEFAULT_RADIUS, supplier.getRandomColor())
    }
}
