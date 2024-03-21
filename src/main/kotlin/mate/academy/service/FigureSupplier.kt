package mate.academy.service

import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.models.*
import kotlin.random.Random

class FigureSupplier {
    private val colorSupplier = ColorSupplier()
    fun getRandomFigure(): Figure {
        val random = Random.nextInt(5)
        return when (random) {
            0 -> Square(
                Random.nextDouble(1.0, 10.0),
                colorSupplier.getRandomColor())
            1 -> Rectangle(
                Random.nextDouble(1.0, 10.0),
                Random.nextDouble(1.0, 10.0),
                colorSupplier.getRandomColor())
            2 -> RightTriangle(
                Random.nextDouble(1.0, 10.0),
                Random.nextDouble(1.0, 10.0),
                colorSupplier.getRandomColor()
            )

            3 -> Circle(
                Random.nextDouble(1.0, 10.0),
                colorSupplier.getRandomColor())
            else -> IsoscelesTrapezoid(
                Random.nextDouble(1.0, 10.0),
                Random.nextDouble(1.0, 10.0),
                Random.nextDouble(1.0, 10.0),
                colorSupplier.getRandomColor()
            )
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(10.0, Color.WHITE)
    }
}
