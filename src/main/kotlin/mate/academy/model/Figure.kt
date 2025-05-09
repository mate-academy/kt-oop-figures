package mate.academy.model

import mate.academy.service.FigureAreaCalculator
import mate.academy.service.FigureDrawer

abstract class Figure (protected val color: Color) : FigureAreaCalculator, FigureDrawer {

    override fun toString(): String {
        return "Figure(color=$color)"
    }
}
