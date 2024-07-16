package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Figure
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square
import mate.academy.util.randomFullRangeInt
import mate.academy.util.randomHighRangeInt
import mate.academy.util.randomLowRangeInt

class FigureSupplier {

    fun getRandomFigure() : Figure {
        val randomColor = ColorSupplier().getRandomColor()

        return when (Figure::class.sealedSubclasses.random()) {
            Square::class -> Square(randomColor, randomFullRangeInt())
            Rectangle::class -> Rectangle(randomColor, randomLowRangeInt(), randomHighRangeInt())
            RightTriangle::class -> RightTriangle(randomColor, randomLowRangeInt(), randomHighRangeInt())
            Circle::class -> Circle(randomColor, randomFullRangeInt())
            IsoscelesTrapezoid::class -> IsoscelesTrapezoid(randomColor,
                    randomLowRangeInt(), randomHighRangeInt(), randomLowRangeInt())
            else -> throw NoSuchElementException("No figure handler present")
        }
    }

    fun getDefaultFigure() : Figure = Circle()

}
