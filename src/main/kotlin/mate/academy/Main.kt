package mate.academy

import mate.academy.model.Figure
import mate.academy.service.ColorSupplier
import mate.academy.service.FigureSupplier

const val COUNT_FIGURES = 10

fun main() {
    val colorSupplier = ColorSupplier()
    val figureSupplier = FigureSupplier(colorSupplier)

    fun makeArrFigures(): Array<Figure> {
        return Array(COUNT_FIGURES) { index ->
            if (index < COUNT_FIGURES / 2)
                figureSupplier.getRandomFigure()
            else
                figureSupplier.getDefaultFigure()
        }
    }

    fun drawFigures(figures : Array<Figure>) {
        figures.forEach { it.draw() }
    }

    drawFigures(makeArrFigures())
}
