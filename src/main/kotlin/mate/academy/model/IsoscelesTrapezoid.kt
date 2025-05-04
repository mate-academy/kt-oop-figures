package mate.academy.model

class IsoscelesTrapezoid(color: Color,
                         private val lowerBaseSide: Double,
                         private val highBaseSide: Double,
                         private val height: Double)
    : Figure(color) {
    override fun area(): Double = (lowerBaseSide + highBaseSide) * height / 2

    override fun draw() {
        println(
            "Figure: isosceles trapezoid, area: ${area()} sq. units, " +
                    "height: $height units, " +
                    "lower base side: $lowerBaseSide units, " +
                    "high base side: $highBaseSide units, " +
                    "color: $color")
    }
}
