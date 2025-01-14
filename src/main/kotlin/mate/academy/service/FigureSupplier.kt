package mate.academy.service

import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.figures.Circle
import mate.academy.model.figures.IsoscelesTrapezoid
import mate.academy.model.figures.Rectangle
import mate.academy.model.figures.RightTriangle
import mate.academy.model.figures.Square

const val DEFAULT_RADIUS: Int = 10
const val MIN_VAL: Int = 10
const val MAX_VAL: Int = 20
const val CIRCLE_VAL: Int = 1
const val TRAPEZOID_VAL: Int = 2
const val RECTANGLE_VAL: Int = 3
const val RIGHT_TRIANGLE_VAL: Int = 4

class FigureSupplier {
    fun getRandomFigure(num: Int): Figure {
        val colorSupplier: ColorSupplier = ColorSupplier()

        return when(num) {
            CIRCLE_VAL -> Circle(colorSupplier.getRandomColor(), getRandomNum())

            TRAPEZOID_VAL -> IsoscelesTrapezoid(colorSupplier.getRandomColor(), getRandomNum(), getRandomNum())

            RECTANGLE_VAL -> Rectangle(colorSupplier.getRandomColor(), getRandomNum(), getRandomNum())

            RIGHT_TRIANGLE_VAL -> RightTriangle(colorSupplier.getRandomColor(), getRandomNum())

            else -> Square(colorSupplier.getRandomColor(), getRandomNum())

        }
    }

    private fun getRandomNum(): Int {
        return (MIN_VAL..MAX_VAL).random()
    }

    fun getDefaultFigure(): Figure {
        return Circle(Color.WHITE, DEFAULT_RADIUS)
    }
}
