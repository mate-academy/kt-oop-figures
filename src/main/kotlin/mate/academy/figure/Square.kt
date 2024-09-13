package mate.academy.figure

import mate.academy.model.Color
import mate.academy.service.AreaOfFigureSupplier
import mate.academy.service.DrawSupplier

class Square(
    color: Color,
    private val leg: Double
) : Figure(color),
    AreaOfFigureSupplier, DrawSupplier {
    override fun getAreaOfFigure(): Double {
        return leg * leg
    }

    override fun drawFigure() {
        println(
            "Figure: square, area: $leg sq. units," +
                    " leg: $leg units, color: $color"
        )
    }
}
