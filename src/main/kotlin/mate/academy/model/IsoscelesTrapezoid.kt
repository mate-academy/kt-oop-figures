package mate.academy.model

class IsoscelesTrapezoid(color: Color, val base1: Double,
                         val base2: Double, val height: Double): Figure(color) {

    override fun getArea(): Double {
        return (base1 + base2) * height / 2
    }

    override fun draw() {
        println(
            "Figure: isosceles trapezoid, " +
                    "area: ${getArea()} sq. units, " +
                    "base1: $base1 units, " +
                    "base2: $base2 units, " +
                    "height: $height units, " +
                    "color: ${color.name.lowercase()}"
        )
    }
}
