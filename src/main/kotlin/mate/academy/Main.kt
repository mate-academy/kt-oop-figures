package mate.academy

import mate.academy.model.Figure
import mate.academy.service.ColorSupplier
import mate.academy.service.FigureSupplier

const val TOTALFIG = 6
fun main() {
    val colorSupplier = ColorSupplier()
    val figureSupplier = FigureSupplier(colorSupplier)

    val randomFiguresCount = TOTALFIG / 2

    var figures = Array<Figure>(TOTALFIG) { index ->
        if (index < randomFiguresCount) {
            figureSupplier.getRandomFigure()
        } else {
            figureSupplier.getDefaultFigure()
        }
    }

    for (figure in figures) {
        figure.draw()
    }
}
