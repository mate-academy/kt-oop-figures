package mate.academy.service

import mate.academy.enums.Color
import mate.academy.enums.FigureTypes
import mate.academy.model.Circle
import mate.academy.model.Figure
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square
import kotlin.random.Random

const val DEFAULT_RADIUS = 10.0
const val MAX_FIGURE_SIZE = 100.0

class FigureSupplier {
    private val figureTypes: Array<FigureTypes> = FigureTypes.values()
    private val defaultColor: String = Color.WHITE.toString();
    private val colorSupplier: ColorSupplier = ColorSupplier()

    fun getRandomFigure(): Figure {
        val figureName: FigureTypes = figureTypes[Random.nextInt(figureTypes.size)]
        return when (figureName) {
            FigureTypes.CIRCLE -> makeRandomCircle()
            FigureTypes.SQUARE -> makeRandomSquare()
            FigureTypes.RECTANGLE -> makeRandomRectangle()
            FigureTypes.RIGHT_TRIANGLE -> makeRandomRightTriangle()
            FigureTypes.ISOSCELES_TRAPEZOID -> makeRandomIsoscelesTrapezoid()
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(defaultColor, DEFAULT_RADIUS)
    }

    private fun makeRandomCircle(): Circle = Circle(
        colorSupplier.getRandomColor().toString(),
        Random.nextDouble(MAX_FIGURE_SIZE)
    );


    private fun makeRandomSquare(): Square = Square(
        colorSupplier.getRandomColor().toString(),
        Random.nextDouble(MAX_FIGURE_SIZE)
    )

    private fun makeRandomRectangle(): Rectangle {
        val width: Double = Random.nextDouble(MAX_FIGURE_SIZE)
        val height: Double = Random.nextDouble(width)
        return Rectangle(colorSupplier.getRandomColor().toString(), width, height)
    }

    private fun makeRandomRightTriangle(): RightTriangle = RightTriangle(
        colorSupplier.getRandomColor().toString(),
        Random.nextDouble(MAX_FIGURE_SIZE),
        Random.nextDouble(MAX_FIGURE_SIZE)
    )

    private fun makeRandomIsoscelesTrapezoid(): IsoscelesTrapezoid = IsoscelesTrapezoid(
        colorSupplier.getRandomColor().toString(),
        Random.nextDouble(MAX_FIGURE_SIZE),
        Random.nextDouble(MAX_FIGURE_SIZE),
        Random.nextDouble(MAX_FIGURE_SIZE)
    )
}
