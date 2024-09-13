package mate.academy.figure

import mate.academy.model.Color
import mate.academy.service.AreaOfFigureSupplier
import mate.academy.service.DrawSupplier

abstract class Figure(val color: Color) : DrawSupplier, AreaOfFigureSupplier {
}
