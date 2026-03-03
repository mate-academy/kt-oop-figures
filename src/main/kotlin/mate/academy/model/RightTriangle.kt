package mate.academy.model

const val TWO = 2

class RightTriangle(val color: Color,
                    val firstLeg: Double,
                    val secondLeg: Double) : Figure {
    override fun draw() {
        println("Figure: triangle, firstLeg: $firstLeg units, " +
                "secondLeg: $secondLeg units, area: ${getArea()} sq. units, " +
                "color: ${color.toString().lowercase()}")
    }

    override fun getArea(): Double {
        return (firstLeg * secondLeg) / TWO
    }
}
