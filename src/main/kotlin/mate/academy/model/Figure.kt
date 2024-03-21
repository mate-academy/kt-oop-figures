package mate.academy.model

interface Figure {
    val color: Color
    fun calculateArea(): Double
    fun draw()
}