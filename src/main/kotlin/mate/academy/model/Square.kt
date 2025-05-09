package mate.academy.model

import mate.academy.model.behavior.AreaCalculable

class Square(color: Color, val side: Double) : Figure(color), AreaCalculable {

    override fun calculateArea() = side * side

    override fun draw() {
        println(
            "Figure: ${javaClass.simpleName.lowercase()}, area: ${calculateArea()} sq. units,"
                    + " side: $side units, color: $color"
        )
    }
}
