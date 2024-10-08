package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square
import kotlin.random.Random

class FigureSupplier(private val colorSupplier: ColorSupplier) {
    private val minSize = 1.0
    private val maxSize = 10.0
    private val defaultRadius = 10.0

    fun getRandomFigure(): Figure {
        val color = colorSupplier.getRandomColor()
        return when (Random.nextInt(5)) {
            0 -> Square(color, Random.nextDouble(minSize, maxSize))
            1 -> Rectangle(color, Random.nextDouble(minSize, maxSize), Random.nextDouble(minSize, maxSize))
            2 -> RightTriangle(color, Random.nextDouble(minSize, maxSize), Random.nextDouble(minSize, maxSize))
            3 -> Circle(color, Random.nextDouble(minSize, maxSize))
            else -> IsoscelesTrapezoid(color, Random.nextDouble(minSize, maxSize), Random.nextDouble(minSize, maxSize), Random.nextDouble(minSize, maxSize))
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(Color.WHITE, defaultRadius)
    }
}
