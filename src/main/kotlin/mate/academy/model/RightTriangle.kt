package mate.academy.model

class RightTriangle(color: Color, val legA: Double, val legB: Double) : Figure(color) {
    override fun area(): Double = legA * legB / 2

    override fun draw() {
        println(
            "Figure: Right triangle, area: ${area().f2()} sq. units, firstLeg: ${legB.f2()} units, " +
                    "secondLeg: ${legB.f2()} units, color: $color "
        )
    }
}
