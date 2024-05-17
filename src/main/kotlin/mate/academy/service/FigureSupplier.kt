package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Figure
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square
import kotlin.random.Random

const val MIN_SIZE = 2
const val MAX_SIZE = 15
const val DEFAULT_SIZE = 10

class FigureSupplier {
    private val colorSupplier = ColorSupplier()
    private val figureImplementations = Figure::class.sealedSubclasses

    fun getRandomFigure(): Figure {
        val getRndSize = { Random.nextInt(MIN_SIZE, MAX_SIZE) }

        return when (figureImplementations.random()) {
            Square::class -> Square(getRndSize(), colorSupplier.getRandomColor())
            Rectangle::class -> Rectangle(getRndSize(), getRndSize(), colorSupplier.getRandomColor())
            RightTriangle::class -> RightTriangle(getRndSize(), getRndSize(), colorSupplier.getRandomColor())
            Circle::class -> Circle(getRndSize(), colorSupplier.getRandomColor())
            IsoscelesTrapezoid::class ->
                IsoscelesTrapezoid(getRndSize(), getRndSize(), getRndSize(), colorSupplier.getRandomColor())

            else -> getDefaultFigure()
        }
    }

    fun getDefaultFigure() = Circle(DEFAULT_SIZE, colorSupplier.getDefaultColor())
}
