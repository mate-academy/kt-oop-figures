package mate.academy.model

import mate.academy.service.ColorSupplier
import kotlin.random.Random

const val DIVIDER = 2

class RightTriangle(
    color: Color,
    val sideA: Int,
    val sideB: Int,
) : Figure(color), BehaviorFigures {

    override fun getArea() = (sideA.times(sideB)).div(DIVIDER).toDouble()

    override fun drawFigure(figure: Figure) {
        val figureName = getFigureName(figure)
        println(
            """Figure: $figureName, 
                |area: ${getArea()} sq.units, 
                |sideA: $sideA units, 
                |sideB: $sideB units, 
                |color: ${getColor(figure)}
                |
                """.trimMargin()
        )
    }

    companion object {
        private val colorSupplier = ColorSupplier()

        fun getRandomRightTriangle(): RightTriangle {
            return RightTriangle(
                colorSupplier.getRandomColor(),
                Random.nextInt(BEGINNING_SIZE_RANGE, FINAL_SIZE_RANGE),
                Random.nextInt(BEGINNING_SIZE_RANGE, FINAL_SIZE_RANGE)
            )
        }
    }
}
