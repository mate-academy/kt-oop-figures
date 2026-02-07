package mate.academy.model

const val DIV = 2

class RightTriangle(color: Color, val sideA: Double, val sideB: Double) : Figure(color) {
    override fun printlnInfo() {
        println(
            "Figure: triangle, area: ${getArea()} sq. units, "
                    + "sideA: $sideA units, sideB: $sideB units, color: $color"
        )
    }

    override fun getArea(): Double = (sideA.times(sideB)).div(DIV)

}
