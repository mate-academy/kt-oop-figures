package mate.academy.service.figurestrategy

import mate.academy.figure.Figure

interface FigureStrategy {
    fun createRandomFigure(): Figure
}
