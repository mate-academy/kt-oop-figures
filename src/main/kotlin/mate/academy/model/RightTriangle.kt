package mate.academy.model

class RightTriangle(private val color: Color,
                    private val leftLeg: Double,
                    private val rightLeg: Double) : Figure(color) {
    override fun draw() {
        println("Figure: right triangle, area: ${calculateArea()} sq. units, " +
                "first leg: $leftLeg units, right leg: $rightLeg units, color: $color")
    }

    override fun calculateArea(): Double {
        return (leftLeg * rightLeg) / 2
    }
}