package mate.academy.service

import mate.academy.model.*
import kotlin.random.Random

class FigureSupplier(private val colorSupplier: ColorSupplier) {
    private val minSize = 1.0
    private val maxSize = 10.0
    private val defaultRadius = 10.0

    fun getRandomFigure(): Figure {
        val color = colorSupplier.getRandomColor()
        return when (FigureType.values().random()) {
            FigureType.SQUARE -> Square(color, Random.nextDouble(minSize, maxSize))
            FigureType.RECTANGLE -> Rectangle(
                color,
                Random.nextDouble(minSize, maxSize),
                Random.nextDouble(minSize, maxSize)
            )
            FigureType.RIGHT_TRIANGLE -> RightTriangle(
                color,
                Random.nextDouble(minSize, maxSize),
                Random.nextDouble(minSize, maxSize)
            )
            FigureType.CIRCLE -> Circle(color, Random.nextDouble(minSize, maxSize))
            FigureType.ISOSCELES_TRAPEZOID -> IsoscelesTrapezoid(
                color,
                Random.nextDouble(minSize, maxSize),
                Random.nextDouble(minSize, maxSize),
                Random.nextDouble(minSize, maxSize)
            )
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(Color.WHITE, defaultRadius)
    }
}
