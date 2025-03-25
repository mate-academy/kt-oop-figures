package mate.academy.model

private const val HALF = 0.5

class RightTriangle(color: Color, var firstLeg: Double, var secondLeg: Double) : Figure(color) {
    override fun draw() {
        println("right triangle, area: ${"%.2f".format(getArea())} sq. units, firstLeg: ${firstLeg} units, " +
                "secondLeg: ${secondLeg} units, color: ${color}")
    }

    override fun getArea(): Double = firstLeg * secondLeg * HALF
}