package mate.academy.model

import mate.academy.service.AreaCalculator
import mate.academy.service.FigurePrinter

abstract class Figure(val color: Color) :
    AreaCalculator, FigurePrinter {
}
