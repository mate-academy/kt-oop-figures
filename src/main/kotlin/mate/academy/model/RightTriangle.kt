package mate.academy.model

class RightTriangle(
    private val color: Color,
    private val firstLeg: Double,
    private val secondLeg: Double
) : Figure(color) {
    private val area = calculateArea()

    override fun calculateArea(): Double {
        return (firstLeg * secondLeg) / 2
    }
    override fun draw() {
        println(
            "Figure: right triangle, area: $area sq. units, "
                    + "firstLeg: $firstLeg units, "
                    + "secondLeg: $secondLeg units, "
                    + "color: $color"
        )
    }
}
