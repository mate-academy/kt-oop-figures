package mate.academy.model

const val TWO = 2

interface Figure {
    val color : Color
    fun area() : Double
    fun draw() : Unit
}
