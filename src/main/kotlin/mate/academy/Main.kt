package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier
import kotlin.random.Random

const val RANDOM_NUMBER_OF_FIGURES = 50
fun main() {
    val createFigures = createFigures()
    for (createFigure in createFigures) {
        println(createFigure?.draw())
    }
}

fun createFigures(): Array<Figure?> {
    val figures = arrayOfNulls<Figure>(Random.nextInt(RANDOM_NUMBER_OF_FIGURES))
    var counter = 0
    val supplier = FigureSupplier()
    while (figures.size != counter)
        if (figures.size / 2 < counter) {
            figures[counter++] = supplier.getDefaultFigure()
        } else {
            figures[counter++] = supplier.getRandomFigure()
        }
    return figures

}
