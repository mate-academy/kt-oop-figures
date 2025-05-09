package mate.academy.model

import mate.academy.model.behavior.AreaCalculable
import kotlin.math.pow

class Circle(color: Color, val radius: Double) : Figure(color), AreaCalculable {
    override fun calculateArea(): Double {
        return Math.PI * radius.pow(2)
    }

    override fun draw() {
        println(
            "Figure: ${javaClass.simpleName.lowercase()}, area: ${calculateArea()} sq. units, "
                    + "radius: $radius units, color: $color"
        )
    }
}
