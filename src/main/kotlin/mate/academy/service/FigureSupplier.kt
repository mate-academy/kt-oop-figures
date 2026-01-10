package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure
import mate.academy.model.IsoscelesTrapezoid
import mate.academy.model.Rectangle
import mate.academy.model.RightTriangle
import mate.academy.model.Square
import kotlin.random.Random

const val FIGUREQUANTITY = 5
const val FIRSTCASE = 0
const val SECONDCASE = 1
const val THIRDTCASE = 2
const val FOURTHCASE = 3
const val FIFTHCASE = 4
const val FROM = 1.0
const val TO = 10.0
const val FROMTRAPEZOID = 5.0
const val TOTRAPEZOID = 15.5
private val randomColor = ColorSupplier();

class FigureSupplier {

    fun getRandomFigure(): Figure {
        return when (Random.nextInt(FIGUREQUANTITY)) {
            FIRSTCASE -> Circle(
                randomColor.getRandomColor(),
                radius = Random.nextDouble(FROM, TO)
            )

            SECONDCASE -> Rectangle(
                randomColor.getRandomColor(),
                width = Random.nextDouble(FROM, TO),
                height = Random.nextDouble(FROM, TO)
            )

            THIRDTCASE -> RightTriangle(
                randomColor.getRandomColor(),
                legA = Random.nextDouble(FROM, TO),
                legB = Random.nextDouble(FROM, TO)
            )

            FOURTHCASE -> Square(
                randomColor.getRandomColor(),
                side = Random.nextDouble(FROM, TO)
            )

            FIFTHCASE -> IsoscelesTrapezoid(
                randomColor.getRandomColor(),
                baseA = Random.nextDouble(FROM, TO),
                baseB = Random.nextDouble(FROMTRAPEZOID, TOTRAPEZOID),
                height = Random.nextDouble(FROM, TO)
            )

            else -> error("Unexpected random number")
        }
    }

    fun getDefaultFigure(): Figure {
        return Circle(Color.WHITE, radius = 10.0)
    }
}
