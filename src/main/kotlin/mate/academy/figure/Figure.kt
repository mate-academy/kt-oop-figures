package mate.academy.figure

import mate.academy.model.Color
import mate.academy.service.AreaCalculator
import mate.academy.service.FigureDraw

sealed class Figure(open val color: Color) : FigureDraw, AreaCalculator {
}
