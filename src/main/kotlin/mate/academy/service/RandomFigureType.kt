package mate.academy.service

import mate.academy.figure.Circle
import mate.academy.figure.Figure
import mate.academy.figure.IsoscelesTrapezoid
import mate.academy.figure.Rectangle
import mate.academy.figure.RightTriangle
import mate.academy.figure.Square
import kotlin.random.Random

private const val MAX_RANDOM_VALUE = 20.0

enum class RandomFigureType {
    CIRCLE {
        override fun createFigure(colorSupplier: ColorSupplier): Figure {
            return Circle(colorSupplier.getRandomColor(), Random.nextDouble(MAX_RANDOM_VALUE))
        }
    },
    ISOSCELES_TRAPEZOID {
        override fun createFigure(colorSupplier: ColorSupplier): Figure {
            return IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                Random.nextDouble(MAX_RANDOM_VALUE), Random.nextDouble(MAX_RANDOM_VALUE),
                Random.nextDouble(MAX_RANDOM_VALUE))
        }
    },
    RECTANGLE {
        override fun createFigure(colorSupplier: ColorSupplier): Figure {
            return Rectangle(colorSupplier.getRandomColor(),
                Random.nextDouble(MAX_RANDOM_VALUE), Random.nextDouble(MAX_RANDOM_VALUE))
        }
    },
    RIGHT_TRIANGLE {
        override fun createFigure(colorSupplier: ColorSupplier): Figure {
            return RightTriangle(colorSupplier.getRandomColor(),
                Random.nextDouble(MAX_RANDOM_VALUE), Random.nextDouble(MAX_RANDOM_VALUE))
        }
    },
    SQUARE {
        override fun createFigure(colorSupplier: ColorSupplier): Figure {
            return Square(colorSupplier.getRandomColor(), Random.nextDouble(MAX_RANDOM_VALUE))
        }
    };

    abstract fun createFigure(colorSupplier: ColorSupplier): Figure
}
