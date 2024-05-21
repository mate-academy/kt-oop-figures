package mate.academy.model

class RightTriangle(
    color: Color,
    val base: Double,
    val height: Double
) : Figure(color) {
    companion object {
        private const val DEFAULT_BASE = 3.0
        private const val DEFAULT_HEIGHT = 4.0
    }
}
