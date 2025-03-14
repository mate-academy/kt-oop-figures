package mate.academy.model

import mate.academy.enums.Color

class Square(private val side: Double, color: Color): Figure(color) {
    override fun draw() {
        println("Figure: square"
                + " area: " + getArea()
                + " sq.units, side: " + side
                + " units, color: " + color)
    }

    override fun getArea(): Double {
        return side * side
    }
}
