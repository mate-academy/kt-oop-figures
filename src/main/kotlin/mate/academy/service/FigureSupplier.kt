package mate.academy.service

import mate.academy.model.*
import kotlin.random.Random

class FigureSupplier {

    private val colorSupplier = ColorSupplier()
    private val random = Random

    fun getRandomFigure(): Figure {
        val figureType = random.nextInt(5)
        return when (figureType) {
            0 -> Square(colorSupplier.getRandomColor(),
                random.nextDouble(1.0, 10.0))
            1 -> Rectangle(colorSupplier.getRandomColor(),
                random.nextDouble(1.0, 10.0), random.nextDouble(1.0, 10.0))
            2 -> RightTriangle(colorSupplier.getRandomColor(),
                random.nextDouble(1.0, 10.0), random.nextDouble(1.0, 10.0))
            3 -> Circle(colorSupplier.getRandomColor(), random.nextDouble(1.0, 10.0))
            else -> IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextDouble(1.0, 10.0),
                random.nextDouble(1.0, 10.0),
                random.nextDouble(1.0, 10.0))
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(Color.WHITE, 10.0)
    }
}
