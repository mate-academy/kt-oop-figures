package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.DEFAULT_CIRCLE_RADIUS
import mate.academy.model.END_UNITS_RANGE
import mate.academy.model.FIGURES
import mate.academy.model.Figure
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.START_UNITS_RANGE
import mate.academy.model.Square
import kotlin.random.Random
import kotlin.reflect.KClass

class FigureSupplier {
    private val colorSupplier: ColorSupplier = ColorSupplier()

    fun getRandomFigure(): Figure {
        return when (val random: KClass<out Figure> = FIGURES.random()) {
            Circle::class -> getRandomCircle()
            Rectangle::class -> getRandomRectangle()
            RightTriangle::class -> getRandomRightTriangle()
            Square::class -> getRandomSquare()
            IsoscelesTrapezoid::class -> getRandomIsoscelesTrapezoid()
            else -> throw IllegalArgumentException("Unsupported figure: $random")
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(Color.WHITE, DEFAULT_CIRCLE_RADIUS)
    }

    private fun getRandomIsoscelesTrapezoid(): IsoscelesTrapezoid {
        return IsoscelesTrapezoid(
            colorSupplier.getRandomColor(),
            getRandomUnit(),
            getRandomUnit(),
            getRandomUnit()
        )
    }

    private fun getRandomSquare(): Square {
        return Square(
            colorSupplier.getRandomColor(),
            getRandomUnit()
        )
    }

    private fun getRandomRightTriangle(): RightTriangle {
        return RightTriangle(
            colorSupplier.getRandomColor(),
            getRandomUnit(),
            getRandomUnit()
        )
    }

    private fun getRandomRectangle(): Rectangle {
        return Rectangle(
            colorSupplier.getRandomColor(),
            getRandomUnit(),
            getRandomUnit()
        )
    }

    private fun getRandomCircle() : Circle {
        return Circle(
            colorSupplier.getRandomColor(),
            getRandomUnit()
        )
    }

    private fun getRandomUnit(): Double {
        return Random.nextDouble(START_UNITS_RANGE, END_UNITS_RANGE)
    }
}
