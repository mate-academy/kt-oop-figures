package mate.academy

import mate.academy.service.Figure
import mate.academy.service.FigureSupplier

fun main() {
    val figureSupplier = FigureSupplier()
    val figures = Array(6) {
        if (it < 3) {
            figureSupplier.getRandomFigure()
        } else {
            figureSupplier.getDefaultFigure()
        }
    }

    figures.forEach(Figure::draw)
}
