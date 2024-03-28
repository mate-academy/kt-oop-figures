package mate.academy.model

private const val DIVIDER = 2.0

class RightTriangle(
    color: Color, val firstLeg: Int,
    val secondLeg: Int
) : Figure(color) {
    override fun getArea(): Double {
        return firstLeg * secondLeg / DIVIDER
    }

    override fun draw() {
        println(
            "Figure: right triangle  , area: ${getArea()} sq .units," +
                    " firstLeg:$firstLeg  units,secondLeg:$secondLeg  units, color: $color"
        )
    }
}
