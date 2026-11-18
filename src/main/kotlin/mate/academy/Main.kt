package mate.academy

import mate.academy.service.FigureSupplier

fun main() {
    val sup = FigureSupplier()
    val figureArray = arrayOf(sup.getRandomFigure(),
        sup.getRandomFigure(), sup.getDefaultFigure(), sup.getDefaultFigure())
    figureArray.forEach { figure -> figure.draw() }
}
