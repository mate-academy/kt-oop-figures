package mate.academy.model

class RightTriangle(color: Color, val firstLeg: Double, val secondLeg: Double) : Figure(color) {
    override fun draw() {
        println("Figure: triangle, area: ${getArea()} sq. units, "
                + "firstLeg: $firstLeg units, secondLeg:  $secondLeg units, color: $color")
    }

    override fun getArea(): Double = firstLeg.times(secondLeg).div(2)
}
