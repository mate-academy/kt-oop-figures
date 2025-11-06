package mate.academy.service

import mate.academy.model.*
import kotlin.random.Random

class FigureSupplier {
    private val colorSupplier = ColorSupplier()

    fun getRandomFigure(): Figure {
        val randomColor = colorSupplier.getRandomColor()
        return when (Random.nextInt(5)) {
            0 -> Square(Random.nextDouble(1.0, 10.0), randomColor)
            1 -> Rectangle(Random.nextDouble(1.0, 10.0), Random.nextDouble(1.0, 10.0), randomColor)
            2 -> RightTriangle(Random.nextDouble(1.0, 10.0), Random.nextDouble(1.0, 10.0), randomColor)
            3 -> Circle(Random.nextDouble(1.0, 10.0), randomColor)
            else -> IsoscelesTrapezoid(Random.nextDouble(1.0, 10.0), Random.nextDouble(1.0, 10.0), Random.nextDouble(1.0, 10.0), randomColor)
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(10.0, Color.WHITE)
    }
}
