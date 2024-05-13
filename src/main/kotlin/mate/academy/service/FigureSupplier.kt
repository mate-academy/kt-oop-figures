package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Figure
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square
import kotlin.random.Random

class FigureSupplier {
    fun getRandomFigure(): Figure {
        val colorSupplier = ColorSupplier()
        val figuresQuantity = Figure::class.sealedSubclasses.size
        return when (Random.nextInt(figuresQuantity)) {
            ZERO -> Square(Random.nextInt(SIZE_LIMIT), colorSupplier.getRandomColor())
            ONE -> Rectangle(Random.nextInt(SIZE_LIMIT), Random.nextInt(SIZE_LIMIT), colorSupplier.getRandomColor())
            TWO -> RightTriangle(Random.nextInt(SIZE_LIMIT), Random.nextInt(SIZE_LIMIT), colorSupplier.getRandomColor())
            THREE -> Circle(Random.nextInt(SIZE_LIMIT), colorSupplier.getRandomColor())
            else -> {
                IsoscelesTrapezoid(Random.nextInt(SIZE_LIMIT), Random.nextInt(SIZE_LIMIT),
                    Random.nextInt(SIZE_LIMIT), colorSupplier.getRandomColor())
            }
        }
    }
}

const val SIZE_LIMIT = 15
const val ZERO = 0
const val ONE = 1
const val TWO = 2
const val THREE = 3
