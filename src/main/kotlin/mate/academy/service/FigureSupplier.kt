package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Number
import mate.academy.model.RightTriangle
import mate.academy.model.Rectangle
import mate.academy.model.Square
import kotlin.random.Random.Default.nextInt

class FigureSupplier {
    val colorSupplier: ColorSupplier = ColorSupplier()

    fun getDefaultFigure(): Figure {
        return Circle(Color.WHITE, Number.DEFAULT_SIZE.value)
    }

    fun getRandomFigure(): Figure {
        return when (nextInt(Number.FIGURE_COUNT.value)) {
            Number.RANDOM_ZERO.value -> Circle(
                colorSupplier.getRandomColor(),
                nextInt(Number.MIN_SIZE.value, Number.MAX_SIZE.value)
            )

            Number.RANDOM_ONE.value -> RightTriangle(
                colorSupplier.getRandomColor(),
                nextInt(Number.MIN_SIZE.value, Number.MAX_SIZE.value),
                nextInt(Number.MIN_SIZE.value, Number.MAX_SIZE.value)
            )

            Number.RANDOM_TWO.value -> IsoscelesTrapezoid(
                colorSupplier.getRandomColor(),
                nextInt(Number.MIN_SIZE.value, Number.MAX_SIZE.value),
                nextInt(Number.MIN_SIZE.value, Number.MAX_SIZE.value),
                nextInt(Number.MIN_SIZE.value, Number.MAX_SIZE.value)
            )

            Number.RANDOM_THREE.value -> Rectangle(
                colorSupplier.getRandomColor(),
                nextInt(Number.MIN_SIZE.value, Number.MAX_SIZE.value),
                nextInt(Number.MIN_SIZE.value, Number.MAX_SIZE.value)
            )

            else -> Square(
                colorSupplier.getRandomColor(),
                nextInt(Number.MIN_SIZE.value, Number.MAX_SIZE.value)
            )
        }
    }
}
