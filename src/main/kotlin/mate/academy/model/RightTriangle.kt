package mate.academy.model

class RightTriangle(
    color: Color,
    private val firstLeg: Double,
    private val secondLeg: Double
    ) : Figure (color) {

    override fun getArea(): Double = firstLeg * secondLeg / 2

    override fun draw(): String = "Figure: ${javaClass.simpleName.lowercase()}, " +
        "area: ${getArea()} sq. units, firstLeg: $firstLeg units, secondLeg: $secondLeg units, " +
        "color: ${color.toString().lowercase()}"
}
