package mate.academy

import mate.academy.model.Figure
import mate.academy.service.ColorSupplier
import mate.academy.service.FigureSupplier

fun main() {
    val colorSupplier = ColorSupplier()
    val figureSupplier = FigureSupplier(colorSupplier)
    val numberOfFigures = 6
    val numberOfRandomFigures = 3
    val figures = Array<Figure>(numberOfFigures) { index ->
        if (index < numberOfRandomFigures) {
            figureSupplier.getRandomFigure()
        } else {
            figureSupplier.getDefaultFigure()
        }
    }

    figures.forEach { it.draw() }
}
