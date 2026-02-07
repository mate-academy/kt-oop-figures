package mate.academy.model

const val TWO = 2

class IsoscelesTrapezoid(color: Color, val baseA: Double,
    val baseB: Double, val baseC: Double) : Figure(color) {
    override fun printlnInfo() {
        println(
            "Figure: trapezoid, area: ${getArea()} sq. units, "
                    + "baseA: $baseA units, "
                    + "baseB: $baseB units, baseC: $baseC units, color: $color"
        )
    }

    override fun getArea(): Double = (baseA.plus(baseB)).times(baseC).div(TWO)

}
