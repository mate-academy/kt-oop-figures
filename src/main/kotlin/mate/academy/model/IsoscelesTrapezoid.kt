package mate.academy.model

class IsoscelesTrapezoid(color: Color,
                         private val base1: Double,
                         private val base2: Double,
                         private val height: Double) : Figure(color) {

    companion object {
        private const val HALF = 0.5
    }
    override fun getArea(): Double {
        return HALF * (base1 + base2) * height
    }

    override fun draw() {
        println("Figure: isosceles trapezoid, area: ${getArea()} sq. units, " +
                "base1: $base1 units, base2: $base2 units " +
                "height: $height units, color: $color")
    }
}
