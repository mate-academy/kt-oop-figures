package mate.academy.model

class RightTriangle(color: Color, val legA: Double, val legB: Double) : Figure(color) {
    override fun getArea(): Double = legA * legB / 2

    override fun draw() {
        println(
            "Figure: right triangle, area: ${"%.1f".format(getArea())} sq. units, " +
                    "firstLeg: ${"%.1f".format(legA)} units, " +
                    "secondLeg: ${"%.1f".format(legB)} units, color: $color"
        )
    }
}
