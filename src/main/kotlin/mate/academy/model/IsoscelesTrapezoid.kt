package mate.academy.model

class IsoscelesTrapezoid(color: Color,
                         private val top: Int, private val bottom: Int, private val high: Int) : Figure(color) {
    override fun draw() = println(getStartMessage() + "top: $top, bottom: $bottom, high: $high")

    override fun calculateArea() = (top + bottom) * high / 2.0
}