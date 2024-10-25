package mate.academy.model

class RightTriangle(private val firstLeg: Double, private val secondLeg: Double, override val color: Color) : Figure() {
    override fun calculateArea(): Double = (firstLeg * secondLeg) / 2

    override fun draw() {
        println("Figure: right triangle, area: ${calculateArea()} sq. units, firstLeg: " +
                "$firstLeg units, secondLeg: $secondLeg units, color: $color")
    }
}
