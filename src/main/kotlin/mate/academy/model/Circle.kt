package mate.academy.model

class Circle(color: Color, private val radius: Double) : Figure (color) {

    override fun getArea(): Double = Math.PI * radius * radius

    // Concatenation is using instead of text block, because output is one-line,
    // line of code is very long, and for more readability (1 parameter - in 1 line of code).
    // ${javaClass.simpleName.lowercase()} - for reusing universal code in different figures.
    override fun draw(): String = ("Figure: ${javaClass.simpleName.lowercase()}, "
            + "area: ${getArea()} sq. units, "
            + "radius: $radius units, "
            + "color: ${color.toString().lowercase()}"
    )
}
