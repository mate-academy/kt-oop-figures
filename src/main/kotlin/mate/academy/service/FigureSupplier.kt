package mate.academy.service

import kotlin.random.Random
import mate.academy.figures.*
import mate.academy.model.Color

class FigureSupplier {

    private val colorSupplier = ColorSupplier()
    companion object {
        private const val DEFAULT_RADIUS = 10
        private val DEFAULT_COLOR = Color.WHITE
    }

    fun getRandomFigure(): Figure {
        return when (Random.nextInt(5)) {
            0 -> Square(
                colorSupplier.getRandomColor(),
                Random.nextInt(1, 20)
            )
            1 -> Rectangle(
                colorSupplier.getRandomColor(),
                Random.nextInt(1, 20),
                Random.nextInt(1, 20)
            )
            2 -> RightTriangle(
                colorSupplier.getRandomColor(),
                Random.nextInt(1, 20),
                Random.nextInt(1, 20)
            )
            3 -> Circle(
                colorSupplier.getRandomColor(),
                Random.nextInt(1, 20)
            )
            4 -> IsoscelesTrapezoid(
                colorSupplier.getRandomColor(),
                Random.nextInt(5, 15),
                Random.nextInt(10, 25),
                Random.nextInt(2, 10)
            )
            else -> getDefaultFigure()
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(DEFAULT_COLOR, DEFAULT_RADIUS)
    }
}
