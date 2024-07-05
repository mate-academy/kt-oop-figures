package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

fun main() {
    val figureSupplier = FigureSupplier()
    val figures: Array<Figure> = arrayOf(
        figureSupplier.getRandomFigure(),
        figureSupplier.getRandomFigure(),
        figureSupplier.getRandomFigure(),
        figureSupplier.getDefaultFigure(),
        figureSupplier.getDefaultFigure(),
        figureSupplier.getDefaultFigure()
    )
    figures.forEach { it.draw() }
}
