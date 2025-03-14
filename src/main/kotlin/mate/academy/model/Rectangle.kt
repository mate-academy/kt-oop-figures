package mate.academy.model

import mate.academy.enums.Color

class Rectangle(private val sideA: Double, private val sideB: Double, color: Color): Figure(color) {
    override fun draw() {
        println("Figure: rectangle"
                + " area: " + getArea()
                + " sq.units, sideA: " + sideA
                + " units, sideB: " + sideB
                + " units, color: " + color)
    }

    override fun getArea(): Double {
        return sideA * sideB
    }
}
