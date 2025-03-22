package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

const val ARRAY_SIZE = 10

fun main() {
    val figuresArray = ArrayList<Figure>(ARRAY_SIZE)
    val figureSupplier = FigureSupplier()
    repeat(ARRAY_SIZE / 2) { figuresArray.add(figureSupplier.getRandomFigure()) }
    repeat(ARRAY_SIZE / 2) { figuresArray.add(figureSupplier.getDefaultFigure()) }
    figuresArray.forEach(Figure::draw)
}
