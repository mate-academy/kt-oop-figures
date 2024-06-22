package mate.academy.service

import mate.academy.model.Circle
import mate.academy.model.Color
import mate.academy.model.Figure

const val DEFAULT_COLOR = "WHITE"
const val DEFAULT_RADIUS = 10.0

class FigureSupplier {

    fun getRandomFigure(): Figure {
        TODO("Not yet implemented")
    }

    fun getDefaultFigure(): Figure {
        return Circle(Color.valueOf(DEFAULT_COLOR), DEFAULT_RADIUS)
    }
}