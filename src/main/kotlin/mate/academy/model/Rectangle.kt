package mate.academy.model

data class Rectangle(
    override var color: String,
    override var base: Double,
    var height: Double
) : Figure(color, base) {
    override fun area(): Double {
        return base*height
    }

    override fun draw(): String {
        return "Figure: rectangle, area: ${"%.1f".format(area())} sq. units, " +
                "firstSide: $base units, " +
                "secondSide: $height units, color: $color"
    }
}
