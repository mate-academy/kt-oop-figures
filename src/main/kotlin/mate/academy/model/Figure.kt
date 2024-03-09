package mate.academy.model

import mate.academy.properties.Area
import mate.academy.properties.Draw

sealed class Figure(val color: Color): Area, Draw {
}
