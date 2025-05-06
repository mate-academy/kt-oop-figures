package mate.academy.model

import mate.academy.service.ColorSupplier
import kotlin.random.Random

class Square(
    color: Color,
    val side: Int,
) : Figure(color), BehaviorFigures {

    override fun getArea() = side.times(side).toDouble()

    override fun drawFigure(figure: Figure) {
        val figureName = getFigureName(figure)
        println(
            """Figure: $figureName, 
                |area: ${getArea()} sq.units, 
                |side: $side units, 
                |color: ${getColor(figure)}
                |
                """.trimMargin()
        )
    }

    companion object {
        private val colorSupplier = ColorSupplier()

        fun getRandomSquare(): Square {
            return Square(
                colorSupplier.getRandomColor(),
                Random.nextInt(BEGINNING_SIZE_RANGE, FINAL_SIZE_RANGE)
            )
        }
    }
}
