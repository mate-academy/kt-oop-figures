package mate.academy

import mate.academy.service.ColorSupplier
import mate.academy.service.FigureSupplier

fun main() {
    val colorSupplier = ColorSupplier()
    val figureSupplier = FigureSupplier(colorSupplier)
    val figures = listOf(
        figureSupplier.getRandomFigure(), figureSupplier.getRandomFigure(),
        figureSupplier.getRandomFigure(), figureSupplier.getRandomFigure(),
        figureSupplier.getDefaultFigure(), figureSupplier.getDefaultFigure(),
        figureSupplier.getDefaultFigure(), figureSupplier.getDefaultFigure()
    )
    figures.forEach {it.draw()}
}
