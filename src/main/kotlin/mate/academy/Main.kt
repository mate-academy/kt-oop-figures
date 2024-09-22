package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

private const val FIGURES_AMOUNT = 8

fun main() {
    val figureSupplier = FigureSupplier()
    val figures: MutableList<Figure> = ArrayList(FIGURES_AMOUNT)
    for (i in 0..FIGURES_AMOUNT / 2) {
        figures.add(figureSupplier.getRandomFigure())
    }
    for (i in FIGURES_AMOUNT / 2 until FIGURES_AMOUNT) {
        figures.add(figureSupplier.getDefaultFigure())
    }

    figures.forEach { f -> f.draw() }
}
