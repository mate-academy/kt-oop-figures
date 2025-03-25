package mate.academy.model

const val CONST = 0.5

data class RightTriangle(
    override var color: String,
    override var base: Double,
    var height: Double
) : Figure(color, base) {
    override fun area(): Double {
        return CONST * base * height
    }

    override fun draw(): String {
        return "Figure: right triangle, area: ${"%.1f".format(area())} sq. units, " +
                "base: $base units, " +
                "height: $height units, color: $color"
    }
}
