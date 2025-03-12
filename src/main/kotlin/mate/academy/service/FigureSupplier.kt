package mate.academy.service

import mate.academy.model.*
import kotlin.random.Random.Default.nextDouble
import kotlin.random.Random.Default.nextInt

class FigureSupplier {
    private val colorSupplier = ColorSupplier()
    fun getRandomFigure(): Figure {
        val color = colorSupplier.getRandomColor()
        return listOf(
            Square(color, nextInt(1, 10)),
            Circle(color, nextDouble(1.0, 10.0)),
            RightTriangle(color, nextDouble(1.0, 10.0), nextDouble(1.0, 10.0)),
            IsoscelesTrapezoid(color, nextDouble(1.0, 10.0), nextDouble(1.0, 10.0), nextDouble(1.0, 10.0))
        ).random()
    }

    fun getDefaultFigure(): Figure {
        return Circle(Color.WHITE, 10.0)
    }
}