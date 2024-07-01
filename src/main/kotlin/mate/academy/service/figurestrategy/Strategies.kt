package mate.academy.service.figurestrategy

import mate.academy.figure.Circle
import mate.academy.figure.Figure
import mate.academy.figure.IsoscelesTrapezoid
import mate.academy.figure.Rectangle
import mate.academy.figure.RightTriangle
import mate.academy.figure.Square
import mate.academy.service.ColorSupplier
import kotlin.random.Random

private const val MAX_RANDOM_VALUE = 20.0

class CircleStrategy(private val colorSupplier: ColorSupplier) : FigureStrategy {
    override fun createRandomFigure(): Figure {
        return Circle(colorSupplier.getRandomColor(), Random.nextDouble(MAX_RANDOM_VALUE))
    }
}

class IsoscelesTrapezoidStrategy(private val colorSupplier: ColorSupplier) : FigureStrategy {
    override fun createRandomFigure(): Figure {
        return IsoscelesTrapezoid(colorSupplier.getRandomColor(),
            Random.nextDouble(MAX_RANDOM_VALUE), Random.nextDouble(MAX_RANDOM_VALUE),
            Random.nextDouble(MAX_RANDOM_VALUE))
    }
}

class RectangleStrategy(private val colorSupplier: ColorSupplier) : FigureStrategy {
    override fun createRandomFigure(): Figure {
        return Rectangle(colorSupplier.getRandomColor(),
            Random.nextDouble(MAX_RANDOM_VALUE), Random.nextDouble(MAX_RANDOM_VALUE))
    }
}

class RightTriangleStrategy(private val colorSupplier: ColorSupplier) : FigureStrategy {
    override fun createRandomFigure(): Figure {
        return RightTriangle(colorSupplier.getRandomColor(),
            Random.nextDouble(MAX_RANDOM_VALUE), Random.nextDouble(MAX_RANDOM_VALUE))
    }
}

class SquareStrategy(private val colorSupplier: ColorSupplier) : FigureStrategy {
    override fun createRandomFigure(): Figure {
        return Square(colorSupplier.getRandomColor(), Random.nextDouble(MAX_RANDOM_VALUE))
    }
}
