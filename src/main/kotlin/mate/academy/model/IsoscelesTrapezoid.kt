package mate.academy.model

private const val HALF = 0.5

class IsoscelesTrapezoid(color: Color, var topSide: Double, var bottomSide: Double, var height: Double) :
    Figure(color) {
    override fun draw() {
        println(
            "isosceles trapezoid, area: ${"%.2f".format(getArea())} sq. units, topSide: ${topSide} units, " +
                    "bottomSide: ${bottomSide} units, height: ${height} units, color: ${color}"
        )
    }

    override fun getArea(): Double = (topSide + bottomSide) * HALF * height
}
