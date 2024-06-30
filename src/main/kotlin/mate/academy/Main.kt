package mate.academy

import mate.academy.figure.Circle
import mate.academy.figure.IsoscelesTrapezoid
import mate.academy.figure.Rectangle
import mate.academy.figure.RightTriangle
import mate.academy.model.Color
import mate.academy.figure.Square

import mate.academy.service.FigureSupplier

private const val DOUBLE_3 = 3.0
private const val DOUBLE_5 = 5.0

fun main() {
    val circle = Circle(Color.WHITE, DOUBLE_3)
    val isoscelesTrapezoid = IsoscelesTrapezoid(Color.GREEN, DOUBLE_3, DOUBLE_5, DOUBLE_3)
    val rectangle = Rectangle(Color.BLUE, DOUBLE_3, DOUBLE_5)
    val rightTriangle = RightTriangle(Color.BLACK, DOUBLE_3, DOUBLE_5)
    val square = Square(Color.YELLOW, DOUBLE_3)

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
}
