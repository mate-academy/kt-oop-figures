package mate.academy

import mate.academy.figure.Figure
import mate.academy.service.FigureSupplier

fun main() {
    val figures: Array<Figure> = arrayOf(
        FigureSupplier().getRandomFigure(),
        FigureSupplier().getRandomFigure(),
        FigureSupplier().getDefaultFigure(),
        FigureSupplier().getDefaultFigure())

    figures.forEach { it.drawFigure() }
}
