package mate.academy.model

import mate.academy.service.SIZELIMIT
import kotlin.math.PI
import kotlin.math.round

class Circle (val color: Color, val radius: Int): Figure {
    override fun draw() {
        println("Figure: circle, radius: $radius units, " +
                "area: ${getArea()} sq. units, color: ${color.toString().lowercase()}")
    }

    override fun getArea(): Double {
        val result = PI * radius * radius
        return round(result * SIZELIMIT) / SIZELIMIT
    }
}
