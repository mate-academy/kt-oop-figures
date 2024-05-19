package mate.academy.service

import mate.academy.model.*
import mate.academy.model.figures.*
import kotlin.random.Random

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
        return Circle(Color.WHITE, 10)
    }

}