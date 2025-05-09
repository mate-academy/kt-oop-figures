package mate.academy.model.figures

import mate.academy.model.Color

class Rectangle(color: Color, private val firstSide : Int, private val secondSide : Int) : Figure(color) {
    override fun getArea() = (firstSide * secondSide).toDouble()

    override fun draw() {
        println("Figure: rectangle, area: ${getArea()} sq. units, "
                + "firstSide: $firstSide units, secondSide: $secondSide units, color: $color")
    }
}
