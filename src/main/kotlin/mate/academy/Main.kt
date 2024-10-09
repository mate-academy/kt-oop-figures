package mate.academy

import mate.academy.service.ColorSupplier
import mate.academy.service.FigureSupplier

fun main() {
    val colorSupplier = ColorSupplier()
    val figureSupplier = FigureSupplier(colorSupplier)
    val numberOfFigures = 6
    val halfOfFigures = numberOfFigures / 2

    repeat(numberOfFigures) { index ->
        val figure = if (index < halfOfFigures) {
            figureSupplier.getRandomFigure()
        } else {
            figureSupplier.getDefaultFigure()
        }
        figure.draw()
    }
}
