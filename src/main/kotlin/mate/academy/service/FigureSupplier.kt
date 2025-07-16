package mate.academy.service

import mate.academy.model.*
import kotlin.random.Random

class FigureSupplier(private val colorSupplier: ColorSupplier) {
    fun getRandomFigure(): Figure {
        return when(Random.nextInt(5)) {
            0 -> Square(colorSupplier.getRandomColor(), Random.nextDouble());
            1 -> Circle(colorSupplier.getRandomColor(), Random.nextDouble())
            2 -> RightTriangle(colorSupplier.getRandomColor(), Random.nextDouble(), Random.nextDouble())
            3 -> Rectangle(colorSupplier.getRandomColor(), Random.nextDouble(), Random.nextDouble())
            else -> IsoscelesTrapezoid(colorSupplier.getRandomColor(), Random.nextDouble(),
                Random.nextDouble(), Random.nextDouble())
        }
    }

    fun getDefaultFigure(): Figure = Circle(Color.WHITE, 10.0)
}
