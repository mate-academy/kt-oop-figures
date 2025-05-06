package mate.academy.model

import mate.academy.service.ColorSupplier
import kotlin.random.Random

class IsoscelesTrapezoid(
    color: Color,
    val base: Int,
    val top: Int,
    val height: Int,
) : Figure(color), BehaviorFigures {

    override fun getArea() = ((base.plus(top)).div(DIVIDER)).times(height).toDouble()

    override fun drawFigure(figure: Figure) {
        val figureName = getFigureName(figure)
        println(
            """Figure: $figureName, 
                |area: ${getArea()} sq.units, 
                |base: $base units, 
                |top: $top units, 
                |height: $height units, 
                |color: ${getColor(figure)}
                |
                """.trimMargin()
        )
    }

    companion object {
        private val colorSupplier = ColorSupplier()

        fun getRandomIsoscelesTrapezoid(): IsoscelesTrapezoid {
            return IsoscelesTrapezoid(
                colorSupplier.getRandomColor(),
                Random.nextInt(BEGINNING_SIZE_RANGE, FINAL_SIZE_RANGE),
                Random.nextInt(BEGINNING_SIZE_RANGE, FINAL_SIZE_RANGE),
                Random.nextInt(BEGINNING_SIZE_RANGE, FINAL_SIZE_RANGE)
            )
        }
    }
}
