package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

private const val FIGURES_AMOUNT = 8

fun main() {
    val figureSupplier = FigureSupplier()
    val figures: Array<Figure> = Array(FIGURES_AMOUNT) {
        i -> if (i < FIGURES_AMOUNT / 2) figureSupplier.getRandomFigure()
    else figureSupplier.getDefaultFigure()
    }
    
    figures.forEach { f -> f.draw() }
}
