package mate.academy

import mate.academy.model.Figure
import mate.academy.service.ColorSupplier
import mate.academy.service.FigureSupplier

fun main() {
    val figureSupplier = FigureSupplier(ColorSupplier())
    val figures = mutableListOf<Figure>()
    figures.addAll(
        mutableListOf(
            figureSupplier.getRandomFigure(),
            figureSupplier.getRandomFigure(),
            figureSupplier.getDefaultFigure(),
            figureSupplier.getDefaultFigure()
        )
    )
    figures.forEach { figure -> figure.draw() }
}
