package mate.academy.model

class Rectangle (color : Color, private val length : Int, private val width : Int) : Figure(color) {
    override fun draw (){
        println("Figure: rectangle, area: ${length * width} sq. units, $length: length, " +
                "$width: width, color: ${color.name}")
    }
}
