package mate.academy.model

class Rectangle(val width: Int, val height: Int, color: Color) : Figure(color) {

    override fun getArea(): Double {
        return (width * height).toDouble()
    }

    override fun draw() {
        println("Figure: rectangle, area: " + getArea() + " sq. units, width: $width"
                + " units, height: $height units, color: $color");
    }
}
