package mate.academy

import mate.academy.figure.*
import mate.academy.model.Color
import mate.academy.service.FigureSupplier

fun main() {
    val circle = Circle(Color.WHITE, 3.0)
    val isoscelesTrapezoid = IsoscelesTrapezoid(Color.GREEN, 3.0, 3.0, 4.35)
    val rectangle = Rectangle(Color.BLUE, 24.0, 8.0)
    val rightTriangle = RightTriangle(Color.BLACK, 10.0, 5.0)
    val square = Square(Color.YELLOW, 50.0)

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
