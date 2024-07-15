package mate.academy.model

class Square(
        color: Color,
        private val side: Int
) : Figure(color) {

    override fun getArea(): String {
        return "Figure: ${this::class.simpleName}, area: ${side * side} sq. units, side: $side units, " +
                "color: ${color.name.lowercase()}"
    }

}
