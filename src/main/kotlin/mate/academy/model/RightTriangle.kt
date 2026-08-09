package mate.academy.model

class RightTriangle(
    override val color: Color,
    val firstLeg: Double,
    val secondLeg: Double
) : Figure {

    override fun getArea(): Double {
        return firstLeg * secondLeg / 2.0
    }

    override fun draw() {
        println(
            "Figure: triangle, area: ${getArea()} sq. units, " +
                    "firstLeg: $firstLeg units, secondLeg: $secondLeg units, " +
                    "color: ${color.name.lowercase()}"
        )
    }
}
