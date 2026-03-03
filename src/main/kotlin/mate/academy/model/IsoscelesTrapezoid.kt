package mate.academy.model

import mate.academy.service.SIZELIMIT
import kotlin.math.round

class IsoscelesTrapezoid(val color: Color, val height: Double,
                         val base1: Double, val base2: Double,) : Figure {
    override fun draw() {
        println("Figure: isosceles trapezoid, height: $height units," +
                " base1: $base1 units, base2: $base2 units, area: ${getArea()} sq. units,)" +
                " color: ${color.toString().lowercase()}")
    }

    override fun getArea(): Double {
        val result = (base1 + base2) * height / TWO
        return round(result * SIZELIMIT) / SIZELIMIT
    }
}
