package mate.academy.model

import kotlin.math.pow

class Circle(private val radius:Double, color: Color): Figure(color) {

    override fun getArea(): Double {
        return Math.PI.times(radius.pow(2))
    }

    override fun draw() {
        println(
            "Figure: ${this.javaClass.simpleName.lowercase()}, area: ${getArea()}"
                    + " sq. units, radius: $radius"
                    + " units, color: $color"
        )
    }
}
