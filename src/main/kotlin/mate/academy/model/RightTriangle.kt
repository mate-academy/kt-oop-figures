package mate.academy.model

class RightTriangle(color: Color,
                    private val baseSide: Double,
                    private val height: Double)
    : Figure(color) {
    override fun area(): Double = baseSide * height / 2

    override fun draw() {
        println(
            "Figure: right triangle, area: ${area()} sq. units, " +
                    "height: $height units, " +
                    "base side: $baseSide units, " +
                    "color: $color")
    }
}
