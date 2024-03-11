package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

const val ARRAY_SIZE: Int = 10
val figureSupplier: FigureSupplier = FigureSupplier()
fun main() {
    val figures: Array<Figure> = Array(ARRAY_SIZE) { index ->
        when(index % 2) {
            0 -> figureSupplier.getDefaultFigure()
            else -> figureSupplier.getRandomFigure()
        }
    }

    for (figure in figures) {
        figure.draw()
    }
}
