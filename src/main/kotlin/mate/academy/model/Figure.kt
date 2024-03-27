package mate.academy.model

import mate.academy.service.AriaCalculator
import mate.academy.service.FigurePrinter

abstract class Figure(val color: Color) :
    AriaCalculator, FigurePrinter {
}
