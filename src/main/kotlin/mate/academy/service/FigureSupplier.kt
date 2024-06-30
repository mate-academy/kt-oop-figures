package mate.academy.service

import mate.academy.figure.*
import mate.academy.model.Color
import kotlin.random.Random
import kotlin.random.nextInt

class FigureSupplier {
    private val colorSupplier = ColorSupplier()

    fun getRandomFigure() : Figure {
        val randomColor = colorSupplier.getRandomColor()

        fun randomUnit()= Random.nextDouble(20.0)

        return when(Random.nextInt(1..5)) {
            2 -> IsoscelesTrapezoid(randomColor, randomUnit(), randomUnit(), randomUnit())
            3 -> Rectangle(randomColor, randomUnit(), randomUnit())
            4 -> RightTriangle(randomColor, randomUnit(), randomUnit())
            5 -> Square(randomColor, randomUnit())
            else -> Circle(randomColor, randomUnit())
        }
    }

    fun getDefaultFigure() = Circle(Color.WHITE, 10.0)
}
