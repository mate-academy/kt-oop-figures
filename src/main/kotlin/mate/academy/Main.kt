package mate.academy

import mate.academy.service.FigureSupplier

fun main() {
    val figureSupplier = FigureSupplier()

    listOf(
            figureSupplier.getRandomFigure(),
            figureSupplier.getRandomFigure(),
            figureSupplier.getRandomFigure(),
            figureSupplier.getDefaultFigure(),
            figureSupplier.getDefaultFigure(),
            figureSupplier.getDefaultFigure()
    ).forEach { println(it.getArea()) }
}
