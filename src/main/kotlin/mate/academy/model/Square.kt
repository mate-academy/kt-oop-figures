package mate.academy.model

import kotlin.math.round

class Square(val color: Color, val side: Double) : Figure {
    override fun draw() {
        println("Figure: square, side: $side units, " +
                "area: ${getArea()} sq. units, color: ${color.toString().lowercase()}")
    }

    override fun getArea(): Double {
        val result = side * side
        return round(result * SIZE_LIMIT) / SIZE_LIMIT
    }
}
