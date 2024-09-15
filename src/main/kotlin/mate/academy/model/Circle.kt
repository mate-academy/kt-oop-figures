package mate.academy.model

class Circle(color: Color, private val radius: Double) : Figure (color) {

    override fun getArea(): Double = Math.PI * radius * radius

    override fun draw(): String = ("Figure: ${javaClass.simpleName.lowercase()}, "
            + "area: ${getArea()} sq. units, "
            + "radius: $radius units, "
            + "color: ${color.toString().lowercase()}"
//            + javaClass.getDeclaredFields().asSequence()
//                .map { "${it.name}: ${this.get(it.name)}"}
//                .joinToString(", ")
    )
}
