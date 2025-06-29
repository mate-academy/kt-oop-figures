package mate.academy.model

const val HALF = 0.5

class IsoscelesTrapezoid(val base1: Double, val base2: Double,
                         val height: Double, val color: Color) : Figure {

    override fun getArea(): Double {
        return (base1 + base2) * height * HALF
    }

    override fun draw() {
        println(
            "Figure: isosceles trapezoid, area: ${getArea()} sq. units, " +
                    "base1: $base1 units, base2: $base2 units, height: $height units, color: ${color.name.lowercase()}"
        )
    }
}
