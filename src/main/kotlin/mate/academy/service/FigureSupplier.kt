package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle;
import mate.academy.model.Square
import kotlin.random.Random

class FigureSupplier {
    private val colorSupplier = ColorSupplier()
    private val fromIndex = 1
    private val toIndex = 6

    fun getRandomFigure(): Figure {
        return when (Random.nextInt(fromIndex, toIndex)) {
            1 -> Circle(colorSupplier.getRandomColor(), Random.nextDouble())
            2 -> IsoscelesTrapezoid(
                colorSupplier.getRandomColor(), Random.nextDouble(),
                Random.nextDouble(), Random.nextDouble()
            )
            3 -> Rectangle(colorSupplier.getRandomColor(), Random.nextDouble(), Random.nextDouble())
            4 -> RightTriangle(colorSupplier.getRandomColor(), Random.nextDouble(), Random.nextDouble())
            else -> Square(colorSupplier.getRandomColor(), Random.nextDouble())
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(Color.WHITE, 10.0)
    }
}
