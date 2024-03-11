package mate.academy.model

class RightTriangle(color: Color,
                    val firstLeg: Int,
                    val secondLeg: Int) : Figure(color) {
    override fun draw() {
        println("Figure: right triangle, area: ${getArea()} sq. units, " +
                "firstLeg: $firstLeg units, secondLeg: $secondLeg units," +
                " color: $color")
    }

    override fun getArea(): Double {
        return firstLeg * secondLeg / 2.0
    }
}
