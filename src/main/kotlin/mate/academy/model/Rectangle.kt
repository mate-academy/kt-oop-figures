package mate.academy.model

import mate.academy.service.ColorSupplier
import kotlin.random.Random

class Rectangle(
    color: Color,
    val sideA: Int,
    val sideB: Int,
) : Figure(color), BehaviorFigures {

    override fun getArea() = sideA.times(sideB).toDouble()

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

        fun getRandomRectangle(): Rectangle {
            return Rectangle(colorSupplier.getRandomColor(),
            Random.nextInt(BEGINNING_SIZE_RANGE, FINAL_SIZE_RANGE),
            Random.nextInt(BEGINNING_SIZE_RANGE, FINAL_SIZE_RANGE)
            )
        }
    }
}
