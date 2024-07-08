package mate.academy.model

class Square(
    color: Color,
    private val side: Double,
) : Figure(color) {

    override fun getArea(): Double {
        return side * side
    }

    override fun draw() {
        println(
            "Figure: ${this.javaClass.simpleName.lowercase()}, area: ${getArea()}"
                    + " sq. units, side: $side"
                    + " units, color: $color"
        )
    }
}
