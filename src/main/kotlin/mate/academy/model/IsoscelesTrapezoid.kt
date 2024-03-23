package mate.academy.model

class IsoscelesTrapezoid (color : Color, private val a : Int,
                          private val b : Int, private val h : Int) : Figure(color) {
    override fun draw (){
        println("Figure: isoscelesTrapezoid, area: ${(a + b) * h / 2} sq. units, " +
                "$a: a, $b: b, $h: h  color: ${color.name}")
    }
}
