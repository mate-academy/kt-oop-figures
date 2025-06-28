package mate.academy.service

import mate.academy.figures.Figure
import mate.academy.figures.Circle
import mate.academy.figures.Square
import mate.academy.figures.Rectangle
import mate.academy.figures.IsoscelesTrapezoid
import mate.academy.figures.RightTriangle
import mate.academy.model.Color
import kotlin.random.Random

const val DEFAULT_RADIUS = 10

const val FIGURE_COUNT = 5

const val MIN_SIDE = 1
const val MAX_SIDE = 20

const val MIN_SHORT_BASE = 5
const val MAX_SHORT_BASE = 15

const val MIN_LONG_BASE = 10
const val MAX_LONG_BASE = 25

const val MIN_HEIGHT = 2
const val MAX_HEIGHT = 10

const val ZERO = 0
const val FIRST = 1
const val SECOND = 2
const val THIRD = 3
const val FOUR = 4

class FigureSupplier {
    private val colorSupplier = ColorSupplier()

    fun getRandomFigure(): Figure {
        return when (Random.nextInt(FIGURE_COUNT)) {
            ZERO -> Square(
                colorSupplier.getRandomColor(),
                Random.nextInt(MIN_SIDE, MAX_SIDE)
            )
            FIRST -> Rectangle(
                colorSupplier.getRandomColor(),
                Random.nextInt(MIN_SIDE, MAX_SIDE),
                Random.nextInt(MIN_SIDE, MAX_SIDE)
            )
            SECOND -> RightTriangle(
                colorSupplier.getRandomColor(),
                Random.nextInt(MIN_SIDE, MAX_SIDE),
                Random.nextInt(MIN_SIDE, MAX_SIDE)
            )
            THIRD -> Circle(
                colorSupplier.getRandomColor(),
                Random.nextInt(MIN_SIDE, MAX_SIDE)
            )
            FOUR -> IsoscelesTrapezoid(
                colorSupplier.getRandomColor(),
                Random.nextInt(MIN_SHORT_BASE, MAX_SHORT_BASE),
                Random.nextInt(MIN_LONG_BASE, MAX_LONG_BASE),
                Random.nextInt(MIN_HEIGHT, MAX_HEIGHT)
            )
            else -> getDefaultFigure()
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(Color.WHITE, DEFAULT_RADIUS)
    }
}
