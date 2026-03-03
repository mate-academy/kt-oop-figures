package mate.academy.model

import mate.academy.service.SIZELIMIT
import kotlin.math.round

class Rectangle(val color: Color, val height: Double, val width: Double) : Figure {
    override fun draw() {
        println("Figure: rectangle, length: $height units, " +
                "width: $width units, area: ${getArea()} sq. units, " +
                "color: ${color.toString().lowercase()}")
    }

    override fun getArea(): Double {
        val result =  width * height
        return round(result * SIZELIMIT) / SIZELIMIT
    }
}
