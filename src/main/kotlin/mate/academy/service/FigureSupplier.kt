package mate.academy.service

import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.RightTriangle
import mate.academy.model.Square
import kotlin.random.Random.Default.nextDouble
import kotlin.random.Random.Default.nextInt

const val DEFAULT_RADIUS = 10.0
class FigureSupplier {
    private val colorSupplier = ColorSupplier()
    fun getRandomFigure(): Figure {
        val color = colorSupplier.getRandomColor()
        return listOf(
            Square(color, nextInt()),
            Circle(color, nextDouble()),
            RightTriangle(color, nextDouble(), nextDouble()),
            IsoscelesTrapezoid(
                color,
                nextDouble(),
                nextDouble(),
                nextDouble()
            )
        ).random()
    }

    fun getDefaultFigure(): Figure {
        return Circle(Color.WHITE, DEFAULT_RADIUS)
    }
}
