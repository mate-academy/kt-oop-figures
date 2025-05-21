package mate.academy.model

class Square(val side: Int, color: Color) : Figure(color) {

    override fun getArea(): Double {
        return (side * side).toDouble()
    }

    override fun draw() {
        println("Figure: square, area: " + getArea() + " sq. units, side: $side"
                + " units, color: $color");
    }
}
