package mate.academy.model

import mate.academy.figure_interface.AreaInterface
import mate.academy.figure_interface.DrawInterface

abstract class Figure(color: String) : DrawInterface, AreaInterface {
}