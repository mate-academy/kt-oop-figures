package mate.academy.model

class RightTriangle(color: Color, val firstLeg: Double, val secondLeg: Double) : Figure(color) {
    override fun draw() = println(
        "Figure: right triangle," +
                " area: ${calculateArea()} sq. units," +
                " firstLeg: $firstLeg units," +
                " secondLeg: $secondLeg units," +
                " color: $color"
    )

    override fun calculateArea(): Double = firstLeg * secondLeg / 2
}
