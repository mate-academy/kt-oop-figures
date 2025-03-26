package mate.academy

import mate.academy.service.supplier.ColorSupplier
import mate.academy.service.supplier.FigureSupplier

fun main() {
    val colorSupplier = ColorSupplier()
    val figureSupplier = FigureSupplier(colorSupplier)

    val figures = Array(6) {
        if (it < 3) figureSupplier.getRandomFigure()
        else figureSupplier.getDefaultFigure() }

    figures.forEach { it.draw() }
}
