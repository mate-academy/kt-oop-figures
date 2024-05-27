package mate.academy.model

import mate.academy.model.behavior.AreaCalculable

const val AREA_MULTIPLIER = 0.5

class RightTriangle(color: Color, val firstLeg: Double, val secondLeg: Double) : Figure(color), AreaCalculable {
    override fun calculateArea() = firstLeg * secondLeg * AREA_MULTIPLIER

    override fun draw() {
        println(
            "Figure: ${javaClass.simpleName.lowercase()}, area: ${calculateArea()} sq. units, "
                    + "firstLeg: $firstLeg units, secondLeg: $secondLeg units, color: $color"
        )
    }
}
