package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.Figures
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square
import java.util.Random

const val DEFAULT_RADIUS = 10.0

class FigureSupplier {
    val random = Random()
    val colorSupplier = ColorSupplier()
    fun getRandomFigure(): Figure {
        val colorOfFigure = colorSupplier.getRandomColor()
        val figure = Figures.values()[random.nextInt(Figures.values().size - 1)]
        val result = when (figure) {
            Figures.CIRCLE -> Circle(colorOfFigure, random.nextDouble())
            Figures.ISOSCELESTRAPEZOID -> IsoscelesTrapezoid(
                colorOfFigure, random.nextDouble(),
                random.nextDouble(), random.nextDouble()
            )

            Figures.RECTANGLE -> Rectangle(colorOfFigure, random.nextDouble(), random.nextDouble())
            Figures.RIGHTTRIANGLE -> RightTriangle(colorOfFigure, random.nextDouble(), random.nextDouble())
            Figures.SQUARE -> Square(colorOfFigure, random.nextDouble())
        }
        return result
    }

    fun getDefaultFigure(): Figure {
        return Circle(Color.WHITE, DEFAULT_RADIUS)
    }
}
