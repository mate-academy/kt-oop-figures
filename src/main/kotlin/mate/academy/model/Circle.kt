package mate.academy.model

import mate.academy.service.ColorSupplier
import kotlin.random.Random

const val BEGINNING_SIZE_RANGE = 0
const val FINAL_SIZE_RANGE = 100

class Circle(
    color: Color,
    val radius: Int,
) : Figure(color), BehaviorFigures {

    override fun getArea() = Math.PI.times(radius).times(radius)
    override fun drawFigure(figure: Figure) {
        val figureName = getFigureName(figure)
        println(
            """Figure: $figureName,
                |area: ${getArea()} sq.units, 
                |radius: $radius units, 
                |color: ${getColor(figure)}
                |
                """.trimMargin()
        )
    }

    companion object {
        private val colorSupplier = ColorSupplier()

        fun getRandomCircle(): Circle {
            return Circle(
                colorSupplier.getRandomColor(),
                Random.nextInt(BEGINNING_SIZE_RANGE, FINAL_SIZE_RANGE)
            )
        }
    }
}
