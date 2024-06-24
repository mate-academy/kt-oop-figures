package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square
import kotlin.random.Random

const val FIGURE_COUNTER = 4
const val BEGINNING_SIZE_RANGE = 0
const val FINAL_SIZE_RANGE = 100
const val DEFAULT_FIGURE_RADIUS = 10
const val TYPE_FIGURE_3 = 3

class FigureSupplier(
    val colorSupplier: ColorSupplier,
) {

    fun getRandomFigure(): Figure {
        return when (Random.nextInt(FIGURE_COUNTER)) {
            0 -> Square(
                colorSupplier.getRandomColor(),
                Random.nextInt(BEGINNING_SIZE_RANGE, FINAL_SIZE_RANGE)
            )
            1 -> RightTriangle(
                colorSupplier.getRandomColor(),
                Random.nextInt(BEGINNING_SIZE_RANGE, FINAL_SIZE_RANGE),
                Random.nextInt(BEGINNING_SIZE_RANGE, FINAL_SIZE_RANGE)
            )
            2 -> Rectangle(
                colorSupplier.getRandomColor(),
                Random.nextInt(BEGINNING_SIZE_RANGE, FINAL_SIZE_RANGE),
                Random.nextInt(BEGINNING_SIZE_RANGE, FINAL_SIZE_RANGE)
            )
            TYPE_FIGURE_3 -> IsoscelesTrapezoid(
                colorSupplier.getRandomColor(),
                Random.nextInt(BEGINNING_SIZE_RANGE, FINAL_SIZE_RANGE),
                Random.nextInt(BEGINNING_SIZE_RANGE, FINAL_SIZE_RANGE),
                Random.nextInt(BEGINNING_SIZE_RANGE, FINAL_SIZE_RANGE)
            )
            else -> Circle(
                colorSupplier.getRandomColor(),
                Random.nextInt(BEGINNING_SIZE_RANGE, FINAL_SIZE_RANGE)
            )
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(color = Color.WHITE, radius = DEFAULT_FIGURE_RADIUS)
    }
}
