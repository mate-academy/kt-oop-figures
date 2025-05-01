package mate.academy.model

const val TRAPEZOID_AREA_MULTIPLIER = 0.5

class IsoscelesTrapezoid(color: Color, private val base: Double, private val top: Double,
                         private val height: Double) : Figure(color) {
    override fun getArea(): Double = TRAPEZOID_AREA_MULTIPLIER * (base + top) * height
}
