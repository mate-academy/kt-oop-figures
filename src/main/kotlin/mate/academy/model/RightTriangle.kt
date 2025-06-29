package mate.academy.model

const val HALF2 = 0.5

class RightTriangle(
    val firstLeg: Double,
    val secondLeg: Double,
    val color: Color
) : Figure {

    override fun getArea(): Double {
        return firstLeg * secondLeg * HALF2
    }

    override fun draw() {
        println(
            "Figure: right triangle, area: ${getArea()} sq. units, " +
                    "firstLeg: $firstLeg units, secondLeg: $secondLeg units, color: ${color.name.lowercase()}"
        )
    }
}
