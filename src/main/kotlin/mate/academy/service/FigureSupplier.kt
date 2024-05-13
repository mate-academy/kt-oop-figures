package mate.academy.service

import mate.academy.model.*
import kotlin.random.Random

class FigureSupplier {
    fun getRandomFigure(): Figure {
        val colorSupplier = ColorSupplier()
        val figuresQuantity = Figure::class.sealedSubclasses.size
        return when (Random.nextInt(figuresQuantity)) {
            0 -> Square(Random.nextInt(SIZE_LIMIT), colorSupplier.getRandomColor())
            1 -> Rectangle(Random.nextInt(SIZE_LIMIT), Random.nextInt(SIZE_LIMIT), colorSupplier.getRandomColor())
            2 -> RightTriangle(Random.nextInt(SIZE_LIMIT), Random.nextInt(SIZE_LIMIT), colorSupplier.getRandomColor())
            3 -> Circle(Random.nextInt(SIZE_LIMIT), colorSupplier.getRandomColor())
            else -> {
                IsoscelesTrapezoid(Random.nextInt(SIZE_LIMIT), Random.nextInt(SIZE_LIMIT),
                    Random.nextInt(SIZE_LIMIT), colorSupplier.getRandomColor())
            }
        }
    }
}

const val SIZE_LIMIT = 15
