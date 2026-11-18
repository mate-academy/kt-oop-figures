package mate.academy.model.figure.impl

import mate.academy.model.Color
import mate.academy.model.figure.Figure

const val VALUE_IT = 2.0
class IsoscelesTrapezoid(color: Color,
                         private val firstLeg: Double,
                         private val secondLeg: Double,
                         private val height: Double): Figure(color)  {
    override fun area() = ((firstLeg + secondLeg) / VALUE_IT) * height

    override fun draw() {
        println("Figure: isoscelesTrapezoid, area: ${area()} sq. units," +
                " firstLeg: $firstLeg units, secondLeg: $secondLeg units," +
                " height: $height units, color: $color")
    }
}
