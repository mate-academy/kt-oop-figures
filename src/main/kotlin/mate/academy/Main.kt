package mate.academy

import mate.academy.model.Figure
import mate.academy.service.FigureSupplier

private const val ARRAY_SIZE = 6
private const val HALF = 2
fun main() {
   val figureArr : Array<Figure?> = arrayOfNulls(ARRAY_SIZE)
   for (i in 0 until figureArr.size.div(HALF)) {
       figureArr[i] = FigureSupplier().getRandomFigure()
       figureArr[i]?.draw()
   }
   for (i in figureArr.size.div(2) until figureArr.size) {
       figureArr[i] = FigureSupplier().getDefaultFigure()
       figureArr[i]?.draw()
   }
}
