package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

const val ARRAY_SIZE = 6
fun main() {
    val figureSupplier = FigureSupplier()
    val arrayMedium = ARRAY_SIZE / 2

    val figures : Array<Figure> = Array(ARRAY_SIZE) { i ->
        if (i < arrayMedium) figureSupplier.getRandomFigure()
        else figureSupplier.getDefaultFigure()}
    figures.forEach { figure -> figure.draw() }

    }
