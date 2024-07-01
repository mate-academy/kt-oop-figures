package mate.academy.service

import mate.academy.model.*
import kotlin.random.Random

private const val FIGURE_COUNT = 5

private const val DEFAULT_RADIUS = 10

private const val LIMIT = 50

class FigureSupplier {
    fun getRandomFigure(): Figure {
        val randomColor = ColorSupplier().getRandomColor()
        return when (Random.nextInt(FIGURE_COUNT)) {
            0 -> Circle(randomColor, getRandomInt())
            1 -> IsoscelesTrapezoid(randomColor, getRandomInt(), getRandomInt(), getRandomInt())
            2 -> Rectangle(randomColor, getRandomInt(), getRandomInt())
            3 -> RightTriangle(randomColor, getRandomInt(), getRandomInt())
            4 -> Square(randomColor, getRandomInt())
            else -> throw IllegalArgumentException("Invalid supplied random figure")
        }
    }

    fun getDefaultFigure() : Figure = Circle(radius = DEFAULT_RADIUS)

    private fun getRandomInt() = Random.nextInt(LIMIT)
}