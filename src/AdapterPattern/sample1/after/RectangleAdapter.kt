package AdapterPattern.sample1.after

import AdapterPattern.sample1.shapes.Rectangle

class RectangleAdapter(private var rectangleAdaptee : Rectangle) : Shape {
    override fun draw(x: Int, y: Int, z: Int, w: Int) {
        rectangleAdaptee.draw(x, y, z, w)
    }
}