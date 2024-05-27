package mate.academy.model

import mate.academy.model.behavior.AreaCalculable

class Rectangle(color: Color, val length: Double, val width: Double) : Figure(color), AreaCalculable {
    override fun calculateArea() = length * width

    override fun draw() {
        println(
            "Figure: ${javaClass.simpleName.lowercase()}, area: ${calculateArea()} sq. units, "
                    + "width: $width units, length: $length units, color: $color"
        )
    }
}
