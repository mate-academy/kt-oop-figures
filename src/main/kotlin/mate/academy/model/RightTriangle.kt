package mate.academy.model

import mate.academy.service.ColorProvider

class RightTriangle(
    private val firstLeg: Double,
    private val secondLeg: Double,
    colorProvider: ColorProvider) :
    Figure(colorProvider) {
    companion object {
        private const val HALF_INDEX = 0.5
    }

    override fun area(): Double = HALF_INDEX * firstLeg * secondLeg
    override fun draw() {
        println("Figure: right triangle, area: " +
                "${area()} sq. units, firstLeg: $firstLeg units, "
              + "secondLeg: $secondLeg units, color: $color")
    }
}
