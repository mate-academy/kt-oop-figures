package mate.academy.model

const val HALF_RIGHT_TRIANGLE = 0.5

class RightTriangle(val firstLeg: Int, val secondLeg: Int, val hypotenuse: Int, color: Color) : Figure(color) {
    override fun getArea(): Double {
        return HALF_RIGHT_TRIANGLE * firstLeg * secondLeg;
    }

    override fun draw() {
        println("Figure: right triangle, area: " + getArea() + " sq. units, firstLeg: $firstLeg"
                + " units, secondLeg: $secondLeg units, hypotenuse: $hypotenuse"
                + " units, color: $color");
    }
}
