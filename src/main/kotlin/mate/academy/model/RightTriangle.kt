package mate.academy.model

class RightTriangle(color: Color, private val height: Double, private val width: Double) : Figure(color) {
    override fun draw() {
       println("Figure: rightTriangle, area: ${calculateArea()} sq. units, " +
               "height: $height, width: $width units, color: $color")
    }

    override fun calculateArea(): Double {
        return width.times(height).div(2)
    }
}
