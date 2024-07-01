package mate.academy

import mate.academy.figure.Circle
import mate.academy.figure.IsoscelesTrapezoid
import mate.academy.figure.Rectangle
import mate.academy.figure.RightTriangle
import mate.academy.model.Color
import mate.academy.figure.Square

import mate.academy.service.FigureSupplier

private const val THREE_UNITS = 3.0
private const val FIVE_UNITS = 5.0

fun main() {
    val circle = Circle(Color.WHITE, THREE_UNITS)
    val isoscelesTrapezoid = IsoscelesTrapezoid(Color.GREEN, THREE_UNITS, FIVE_UNITS, THREE_UNITS)
    val rectangle = Rectangle(Color.BLUE, THREE_UNITS, FIVE_UNITS)
    val rightTriangle = RightTriangle(Color.BLACK, THREE_UNITS, FIVE_UNITS)
    val square = Square(Color.YELLOW, THREE_UNITS)

    println("\nDrawing figure by constructor:")
    circle.draw()
    isoscelesTrapezoid.draw()
    rectangle.draw()
    rightTriangle.draw()
    square.draw()

    val figureSupplier = FigureSupplier()

    println("\nDrawing default figure:")
    figureSupplier.getDefaultFigure().draw()

    println("\nDrawing random figure:")
    figureSupplier.getRandomFigure().draw()
    figureSupplier.getRandomFigure().draw()
    figureSupplier.getRandomFigure().draw()
}
