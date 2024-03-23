package mate.academy.model

class Square (color : Color, private val side : Int) : Figure(color){
    override fun draw () {
        println("Figure: rectangle, area: ${side * side} sq. units, $side: side, color: ${color.name}")
    }
}
