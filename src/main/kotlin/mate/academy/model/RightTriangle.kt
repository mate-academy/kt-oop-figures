package mate.academy.model

class RightTriangle(
    color: Color,
    private val firstLeg: Double,
    private val secondLeg: Double
) : Figure(color) {

    override fun getArea(): Double {
        return firstLeg * secondLeg / 2
    }

    override fun draw() {
        println(
            "Figure: ${this.javaClass.simpleName.lowercase()}, area: ${getArea()}"
                    + " sq. units, firstLeg: $firstLeg"
                    + " units, secondLeg: $secondLeg"
                    + "color: $color"
        )
    }
}
