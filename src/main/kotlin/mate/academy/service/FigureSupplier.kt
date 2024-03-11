package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.RightTriangle
import mate.academy.model.Rectangle
import mate.academy.model.Square
import kotlin.random.Random


class FigureSupplier {
    companion object {
        const val DEFAULT_SIZE: Int = 10
        const val FIGURE_COUNT: Int = 5
        const val MAX_SIZE: Int = 15
        const val MIN_SIZE: Int = 1
        const val RANDOM_ZERO: Int = 0
        const val RANDOM_ONE: Int = 1
        const val RANDOM_TWO: Int = 2
        const val RANDOM_THREE: Int = 3
    }
    val random = Random
    val colorSupplier: ColorSupplier = ColorSupplier()

    fun getDefaultFigure(): Figure {
        return Circle(Color.WHITE, DEFAULT_SIZE)
    }

    fun getRandomFigure(): Figure {
        return when(random.nextInt(FIGURE_COUNT)) {
            RANDOM_ZERO ->  Circle(colorSupplier.getRandomColor(),
                               random.nextInt(MIN_SIZE, MAX_SIZE))

            RANDOM_ONE ->  RightTriangle(colorSupplier.getRandomColor(),
                                      random.nextInt(MIN_SIZE, MAX_SIZE),
                                      random.nextInt(MIN_SIZE, MAX_SIZE))

            RANDOM_TWO ->  IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                                           random.nextInt(MIN_SIZE, MAX_SIZE),
                                           random.nextInt(MIN_SIZE, MAX_SIZE),
                                           random.nextInt(MIN_SIZE, MAX_SIZE))

            RANDOM_THREE ->  Rectangle(colorSupplier.getRandomColor(),
                                  random.nextInt(MIN_SIZE, MAX_SIZE),
                                  random.nextInt(MIN_SIZE, MAX_SIZE))

            else ->  Square(colorSupplier.getRandomColor(),
                               random.nextInt(MIN_SIZE, MAX_SIZE))
        }
    }
}
