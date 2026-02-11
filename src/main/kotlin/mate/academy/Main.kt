package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

const val SIZE = 6;
fun main() {
    val supplier = FigureSupplier();
    val arSize = SIZE;
    val figures = Array<Figure>(arSize) { i ->
        if (i < arSize / 2) supplier.getRandomFigure()
        else supplier.getDefaultFigure()
    }

    figures.forEach { it.draw() }
}
