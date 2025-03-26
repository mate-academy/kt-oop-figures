package mate.academy.service.supplier

import mate.academy.model.Color
import mate.academy.service.figure.Circle
import mate.academy.service.figure.Figure
import mate.academy.service.figure.IsoscelesTrapezoid
import mate.academy.service.figure.Rectangle
import mate.academy.service.figure.RightTriangle
import mate.academy.service.figure.Square
import kotlin.random.Random

class FigureSupplier(private val colorSupplier: ColorSupplier) {
    fun getRandomFigure(): Figure {
        return when (Random.nextInt(5)) {
            0 -> Square(
                Random.nextDouble(1.0, 10.0),
                colorSupplier.getRandomColor())
            1 -> Rectangle(
                Random.nextDouble(1.0, 10.0),
                Random.nextDouble(1.0, 10.0),
                colorSupplier.getRandomColor())
            2 -> RightTriangle(
                Random.nextDouble(1.0, 10.0),
                Random.nextDouble(1.0, 10.0),
                colorSupplier.getRandomColor())
            3 -> Circle(
                Random.nextDouble(1.0, 10.0),
                colorSupplier.getRandomColor())
            else -> IsoscelesTrapezoid(
                Random.nextDouble(1.0, 10.0),
                Random.nextDouble(1.0, 10.0),
                Random.nextDouble(1.0, 10.0),
                colorSupplier.getRandomColor())
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(10.0, Color.WHITE)
    }
}
