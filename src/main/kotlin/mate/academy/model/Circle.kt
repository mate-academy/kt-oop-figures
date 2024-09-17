package mate.academy.model

class Circle(color: Color, private val radius: Double) : Figure (color) {

    override fun getArea(): Double = Math.PI * radius * radius

    // Concatenation is using instead of text block, because output should be in one-line, and
    // line of code is very long
    // ${javaClass.simpleName.lowercase()} - for reusing universal code in different figures.
    override fun draw(): String = "Figure: ${javaClass.simpleName.lowercase()}, " +
        "area: ${getArea()}sq. units, radius: $radius units, color: ${color.toString().lowercase()}"
}
