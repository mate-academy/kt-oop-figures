package mate.academy

import mate.academy.service.ColorSupplier
import mate.academy.service.FigureSupplier

fun main() {
    val colorSupplier = ColorSupplier()
    val figureSupplier = FigureSupplier(colorSupplier)
    val totalFigures = TOTAL_FIGURES
    val halfOfFigures = totalFigures / 2

    repeat(totalFigures) { index ->
        val figure = if (index < halfOfFigures) {
            figureSupplier.getRandomFigure()
        } else {
            figureSupplier.getDefaultFigure()
        }
        figure.draw()
    }
}

const val TOTAL_FIGURES = 6
