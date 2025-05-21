package mate.academy.model

const val HALF = 0.5

class IsoscelesTrapezoid(val lengthFirstBase: Int,
                         val lengthSecondBase: Int,
                         val heightTrapezoid: Int, color: Color) : Figure(color) {
    override fun getArea(): Double {
        return HALF * (lengthFirstBase + lengthSecondBase) * heightTrapezoid;
    }

    override fun draw() {
        println("Figure: square, area: " + getArea() + " sq. units, lengthFirstBase: "
                + "$lengthFirstBase units, lengthSecondBase: $lengthSecondBase units, "
                + "heightTrapezoid: $lengthSecondBase units, color: $color")

    }
}
