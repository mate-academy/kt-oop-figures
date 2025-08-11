package mate.academy.model
class Circle(color: Color, private val radius: Int) : Figure(color){
    override fun draw() {
        println(
            """
                Figure: circle, area:${calculateArea()}. units, 
                radius: $radius units, color: $color
            """.trimMargin())
    }

    override fun calculateArea(): Double {
        return Math.PI * radius * radius
    }
}
