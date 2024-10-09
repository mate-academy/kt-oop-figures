package mate.academy

import mate.academy.service.ColorSupplier
import mate.academy.service.FigureSupplier

fun main() {
    val colorSupplier = ColorSupplier()
    val figureSupplier = FigureSupplier(colorSupplier)
    val NUMBER_OF_FIGURES = 6

    repeat(NUMBER_OF_FIGURES) { index ->
        val figure = if (index < NUMBER_OF_FIGURES / 2) {
            figureSupplier.getRandomFigure()
        } else {
            figureSupplier.getDefaultFigure()
        }
        figure.draw()
    }
}
