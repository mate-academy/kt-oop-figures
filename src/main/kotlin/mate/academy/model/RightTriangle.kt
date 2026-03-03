package mate.academy.model

import kotlin.math.round

class RightTriangle(val color: Color,
                    val firstLeg: Double,
                    val secondLeg: Double) : Figure {
    override fun draw() {
        println("Figure: triangle, firstLeg: $firstLeg units, " +
                "secondLeg: $secondLeg units, area: ${getArea()} sq. units, " +
                "color: ${color.toString().lowercase()}")
    }

    override fun getArea(): Double {
        val result = (firstLeg * secondLeg) / TWO
        return round(result * SIZE_LIMIT) / SIZE_LIMIT
    }
}
