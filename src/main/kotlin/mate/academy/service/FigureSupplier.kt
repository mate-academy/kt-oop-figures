package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.FigureType
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square
import kotlin.random.Random

const val MAX_SIZE = 20.0
const val DEFAULT_SIZE = 10.0
val DEFAULT_COLOR = Color.WHITE

val colorSupplier = ColorSupplier()
val figureTypeSupplier = FigureTypeSupplier()

class FigureSupplier {

    fun getDefaultFigure(): Figure {
        return Circle(DEFAULT_COLOR, DEFAULT_SIZE)
    }

    fun getRandomFigure(): Figure {
        val randomFigureType = figureTypeSupplier.getRandomFigureType()
        return when (randomFigureType) {
            FigureType.CIRCLE -> getRandomCircle()
            FigureType.ISOSCELES_TRAPEZOID -> getRandomIsoscelesTrapezoid()
            FigureType.RECTANGLE -> getRandomRectangle()
            FigureType.RIGHT_TRIANGLE -> getRandomRightTriangle()
            FigureType.SQUARE -> getRandomSquare()
        }
    }

    //Those functions are not private - for using without getRandomFigure()
    fun getRandomCircle(): Figure {
        val randomColor = colorSupplier.getRandomColor()
        val randomRadius = Random.nextDouble(MAX_SIZE)
        return Circle(randomColor, randomRadius)
    }

    fun getRandomIsoscelesTrapezoid(): Figure {
        val randomColor = colorSupplier.getRandomColor()
        val randomUpperBase = Random.nextDouble(MAX_SIZE)
        val randomLowerBase = Random.nextDouble(MAX_SIZE)
        val randomHeight = Random.nextDouble(MAX_SIZE)
        return IsoscelesTrapezoid(randomColor, randomUpperBase, randomLowerBase, randomHeight)
    }

    fun getRandomRectangle(): Figure {
        val randomColor = colorSupplier.getRandomColor()
        val randomWidth = Random.nextDouble(MAX_SIZE)
        val randomHeight = Random.nextDouble(MAX_SIZE)
        return Rectangle(randomColor, randomWidth, randomHeight)
    }

    fun getRandomRightTriangle(): Figure {
        val randomColor = colorSupplier.getRandomColor()
        val randomFirstLeg = Random.nextDouble(MAX_SIZE)
        val randomSecondLeg = Random.nextDouble(MAX_SIZE)
        return RightTriangle(randomColor, randomFirstLeg, randomSecondLeg)
    }

    fun getRandomSquare(): Figure {
        val randomColor = colorSupplier.getRandomColor()
        val randomSide = Random.nextDouble(MAX_SIZE)
        return Square(randomColor, randomSide)
    }
}
