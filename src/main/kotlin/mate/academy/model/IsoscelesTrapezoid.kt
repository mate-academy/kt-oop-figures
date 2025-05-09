package mate.academy.model

import mate.academy.model.behavior.AreaCalculable

class IsoscelesTrapezoid(color: Color, val firstBase: Double, val secondBase: Double, val height: Double) :
    Figure(color), AreaCalculable {
    override fun calculateArea() = height * (firstBase + secondBase) / 2

    override fun draw() {
        println(
            "Figure: ${javaClass.simpleName.lowercase()}, area: ${calculateArea()} sq. units, "
                    + "firstBase: $firstBase units, secondBase: $secondBase units, height $height units,"
                    + " color: $color"
        )
    }
}
