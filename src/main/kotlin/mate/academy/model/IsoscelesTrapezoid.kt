package mate.academy.model

data class IsoscelesTrapezoid(
    override var color: String,
    override var base: Double,
    var secondBase: Double,
    var height: Double
) : Figure(color, base) {
    override fun area(): Double {
        return (base + secondBase) / 2 * height
    }

    override fun draw(): String {
        return "Figure: isosceles trapezoid, area: ${"%.1f".format(area())} sq. units, " +
                "firstBase: $base units, secondBase: $base units, " +
                "height: $height units, color: $color"
    }
}
