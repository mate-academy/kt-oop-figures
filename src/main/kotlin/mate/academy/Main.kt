package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

private const val FIGURES_AMOUNT = 10
private const val HALF_DIVIDER = 2

private val figureSupplier: FigureSupplier = FigureSupplier()

fun main() {
    val figures: Array<Figure?> = Array(FIGURES_AMOUNT) { null }
    figures.forEachIndexed { i, _ ->
        if (i < FIGURES_AMOUNT / HALF_DIVIDER) {
            figures[i] = figureSupplier.getRandomFigure()
        } else {
            figures[i] = figureSupplier.getDefaultFigure()
        }
        figures[i]?.draw()
    }
}
