package mate.academy.service

import mate.academy.model.Color
import mate.academy.model.figures.Circle
import mate.academy.model.figures.IsoscelesTrapezoid
import mate.academy.model.figures.Figure
import mate.academy.model.figures.Rectangle
import mate.academy.model.figures.RightTriangle
import mate.academy.model.figures.Square
import kotlin.random.Random

const val DEFAULT_RADIUS = 10

class FigureSupplier(private val colorSupplier: ColorSupplier) {
    fun getRandomFigure(): Figure {
        val color = colorSupplier.getRandomColor()
        val randomSide = Random.nextInt()
        val figureClass = Figure::class.sealedSubclasses.random()
        return when (figureClass) {
            Square::class -> Square(color, randomSide)
            Circle::class -> Circle(color, randomSide)
            Rectangle::class -> Rectangle(color, randomSide, Random.nextInt())
            RightTriangle::class -> RightTriangle(color, randomSide, Random.nextInt())
            else -> IsoscelesTrapezoid(color, randomSide, Random.nextInt(), Random.nextInt())
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(Color.WHITE, DEFAULT_RADIUS)
    }

}
