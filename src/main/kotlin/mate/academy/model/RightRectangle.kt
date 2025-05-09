package mate.academy.model

import mate.academy.enums.Color

class RightRectangle(private val firstLeg: Double, private val secondLeg: Double, color: Color): Figure(color) {
    override fun draw() {
        println("Figure: rightTriangle"
                + " area: " + getArea()
                + " sq.units, firstLeg: " + firstLeg
                + " units, secondLeg: " + secondLeg
                + " units, color: " + color)
    }

    override fun getArea(): Double {
        return (firstLeg * secondLeg) / 2
    }
}
