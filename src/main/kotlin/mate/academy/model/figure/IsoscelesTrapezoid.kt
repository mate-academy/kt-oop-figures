package mate.academy.model.figure

import mate.academy.model.Color
import mate.academy.model.Figure

class IsoscelesTrapezoid(
    private val topParallel: Int,
    private val bottomParallel: Int,
    private val height: Int,
    private val color: Color
) : Figure(color) {
    override fun draw() = println("There’s a isosceles trapezoid drawn with $color color!")

    override fun calculateArea() = (topParallel + bottomParallel) / 2 * height

    override fun getDescription(): String {
        return "isosceles trapezoid, area: ${calculateArea()} sq. units, " +
                "top parallel: $topParallel units, " +
                "bottom parallel: $bottomParallel units, " +
                "height: $height units, " +
                "color: $color."
    }
}
