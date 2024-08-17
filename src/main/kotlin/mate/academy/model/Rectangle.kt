package mate.academy.model

class Rectangle(private val width : Double, private val height : Double
, color: Color) : Figure(color) {
    override fun draw() {
        println("Figure: square, area: ${String.format("%.2f", getArea())}. units" +
                ", width: $width units, height: $height units, color: $color")
    }

    override fun getArea() : Double {
        return width * height
    }
}
