package mate.academy.model

class Square(color: Color, val side: Int) : Figure(color) {
    override fun draw() {
        println("Figure: square, side: $side, color: $color")
    }
}
