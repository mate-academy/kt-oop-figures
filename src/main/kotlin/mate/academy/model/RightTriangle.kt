package mate.academy.model

class RightTriangle(
    color: String,
    private val firstLeg: Double,
    private val secondLeg: Double
) : Figure(color) {
    override fun getArea(): Double {
        return (firstLeg * secondLeg) / 2
    }

    override fun draw() {
        println(
            "Figure: right triangle, area: ${getArea()}, " +
                    "first leg: $firstLeg, second leg: $secondLeg, " +
                    "color: $color"
        )
    }
}
