package mate.academy.model

enum class FigureIndex {
    CIRCLE,
    SQUARE,
    RECTANGLE,
    RIGHT_TRIANGLE,
    ISOSCELES_TRAPEZOID;

    val index: Int
        get() = this.ordinal
}
