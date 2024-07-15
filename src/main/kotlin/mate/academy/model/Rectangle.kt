package mate.academy.model

class Rectangle(
        color: Color,
        private val width: Int,
        private val length: Int
) : Figure(color) {

    override fun getArea(): String {
        return "Figure: ${this::class.simpleName}, area: ${width * length} sq. units, " +
                "width: $width units, length: $length units, color: ${color.name.lowercase()}"
    }

}
