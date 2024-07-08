package mate.academy.model

class IsosceledTrapesoid(
    color: Color,
    private val shortSide: Double,
    private val longSide: Double,
    private val trapezoidH: Double
) : Figure(color) {

    override fun getArea(): Double {
        return ((longSide + shortSide) * trapezoidH) / 2
    }

    override fun draw() {
        println(
            "Figure: ${this.javaClass.simpleName.lowercase()}, area: ${getArea()}"
                    + " sq. units, shortSide: $shortSide"
                    + " sq. units, longSide: $longSide"
                    + " units, h: $trapezoidH"
                    + " units, color: $color"
        );
    }
}
