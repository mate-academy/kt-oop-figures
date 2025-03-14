package mate.academy.model

import mate.academy.enums.Color
import kotlin.math.roundToInt

class Circle(private val radius: Double, color: Color): Figure(color) {

    override fun draw() {
        println("Figure: circle "
                + " area: " + getArea()
                + " sq. units, radius: " + radius
                + " units, color: " + color)
    }

    override fun getArea(): Double {
        return Math.PI * radius * radius
    }
}
