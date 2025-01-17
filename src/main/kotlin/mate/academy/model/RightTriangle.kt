package mate.academy.model

class RightTriangle(color: Color, val firstLeg: Double, val secondLeg: Double, ) : Figure(color) {
    override fun draw() {
        println("Figure: right triangle, first leg: $firstLeg, second leg: $secondLeg, color: $color")
    }
}
