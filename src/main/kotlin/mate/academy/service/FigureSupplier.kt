package mate.academy.service

import mate.academy.model.Color
import mate.academy.model.figure.Figure
import mate.academy.model.figure.impl.*
import kotlin.random.Random

class FigureSupplier {
    private val colorSupplier = ColorSupplier()

    fun getRandomFigure(): Figure {
        return when (Random.nextInt(5)) {
            0 -> Circle(
                colorSupplier.getRandomColor(),
                Random.nextDouble()
            )
            1 -> IsoscelesTrapezoid(
                colorSupplier.getRandomColor(),
                Random.nextDouble(),
                Random.nextDouble(),
                Random.nextDouble()
            )
            2 -> Rectangle(
                colorSupplier.getRandomColor(),
                Random.nextDouble(),
                Random.nextDouble()
            )
            3 -> RightTriangle(
                colorSupplier.getRandomColor(),
                Random.nextDouble(),
                Random.nextDouble()
            )
            4 -> Square(
                colorSupplier.getRandomColor(),
                Random.nextDouble()
            )

            else -> Circle(
                Color.WHITE,
                10.0
            )
        }
    }

    fun getDefaultFigure() = Circle(Color.WHITE, 10.0)
}