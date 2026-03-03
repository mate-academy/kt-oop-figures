package mate.academy.model

class RightTriangle(val color: Color, val area: Double,
                    val firstLeg: Double, val secondLeg: Double) : Figure {
    override fun draw() {
        println("Figure: triangle, area: $area sq. units, firstLeg: $firstLeg units, " +
                "secondLeg: $secondLeg units, color: ${color.toString().lowercase()}")
    }
}