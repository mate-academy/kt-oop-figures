package mate.academy.model

import kotlin.math.PI

open class Circle (color: Color = Color.WHITE, private val radius: Int = 10) : Figure(color) {
    override fun behavior () {
        println("Figure: circle, area: ${PI * radius * radius} sq. units, $radius: units, color: ${color.name}")
    }
}
