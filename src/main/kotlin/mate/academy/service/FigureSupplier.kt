package mate.academy.service

import mate.academy.Circle
import mate.academy.Figure
import mate.academy.IsoscelesTrapezoid
import mate.academy.model.Color
import mate.academy.Rectangle
import mate.academy.RightTriangle
import mate.academy.Square
import kotlin.random.Random

class FigureSupplier {

    fun getRandomFigure(): Figure {
        val colorSupplier = ColorSupplier()
        return when (Random.nextInt(5)) {
            0 -> Square((1..10).random().toDouble(), colorSupplier.getRandomColor())
            1 -> Rectangle((1..10).random().toDouble(), (1..10).random().toDouble(),
                colorSupplier.getRandomColor())
            2 -> RightTriangle((1..10).random().toDouble(), (1..10).random().toDouble(),
                colorSupplier.getRandomColor())
            3 -> Circle((1..10).random().toDouble(), colorSupplier.getRandomColor())
            4 -> IsoscelesTrapezoid((1..10).random().toDouble(), (1..10).random().toDouble(),
                (1..10).random().toDouble(), colorSupplier.getRandomColor())
            else -> throw IllegalArgumentException("Invalid figure type")
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(10.0, Color.WHITE)
    }
}
