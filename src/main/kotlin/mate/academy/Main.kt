package mate.academy

import mate.academy.model.Figure
import mate.academy.service.ColorSupplier
import mate.academy.service.FigureSupplier

fun main() {
    // draw all figures here
    val colorSupplier = ColorSupplier();
    val figureSupplier = FigureSupplier(colorSupplier);

    val figureArray : Array<Figure> = Array<Figure>(6) {
        i -> if (i < 5) figureSupplier.getRandomFigure()
    else figureSupplier.getDefaultFigure()
    }

    for (figure in figureArray) {
        figure.draw()
    }
}

