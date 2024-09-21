package mate.academy.model

import mate.academy.interfaces.AreaInterface
import mate.academy.interfaces.DrawInterface

abstract class Figure(color: String) : DrawInterface, AreaInterface {
}
