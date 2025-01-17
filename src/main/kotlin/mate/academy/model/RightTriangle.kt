package mate.academy.model

class RightTriangle(color: Color, val firstLeg: Int, val secondLeg: Int, ) : Figure(color) {
    override fun draw() {
        println("Figure: right triangle, first leg: $firstLeg, second leg: $secondLeg, color: $color")
    }
}
