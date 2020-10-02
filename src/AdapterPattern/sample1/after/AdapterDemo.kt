package AdapterPattern.sample1.after

import AdapterPattern.sample1.shapes.Line
import AdapterPattern.sample1.shapes.Rectangle

fun main(){
    val shapes : Array<Shape> = arrayOf(LineAdapter(Line()), RectangleAdapter(Rectangle()))

    val x1 = 10
    val y1 = 20
    val x2 = 30
    val y2 = 60

    for (shape in shapes)
        shape.draw(x1, y1, x2, y2)
}