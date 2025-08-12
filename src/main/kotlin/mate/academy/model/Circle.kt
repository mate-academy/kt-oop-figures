package mate.academy.model

class Circle(color: Color, private val radius: Double) : Figure(color) {
    override fun draw(){
        println("Figure: circle, area: ${calculateArea()} sq. units, radius: $radius units, color: $color")
    }

    override fun calculateArea(): Double {
        return radius.times(radius) * Math.PI
    }
}
