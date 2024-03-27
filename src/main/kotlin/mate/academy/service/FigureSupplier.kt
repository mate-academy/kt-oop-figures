package mate.academy.service

import mate.academy.model.Figure
import mate.academy.model.Color
import mate.academy.model.Circle
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Square

private const val DEFAULT_RADIUS: Int = 10

class FigureSupplier {
    fun generateSquare(color: Color, side: Int): Figure {
        return Square(color, side)
    }

    fun generateCircle(color: Color, radius: Int): Figure {
        return Circle(color, radius)
    }

    fun generateIsoscelesTrapezoid(color: Color, topBase: Int, bottomBase: Int, height: Int): Figure {
        return IsoscelesTrapezoid(color, topBase, bottomBase, height)
    }

    fun generateRectangle(color: Color, width: Int, height: Int): Figure {
        return Rectangle(color, width, height)
    }

    fun generateRightTriangle(color: Color, base: Int, height: Int): Figure {
        return RightTriangle(color, base, height)
    }

    fun getDefaultFigure(): Figure = Circle(radius = DEFAULT_RADIUS, color = Color.WHITE)
}
