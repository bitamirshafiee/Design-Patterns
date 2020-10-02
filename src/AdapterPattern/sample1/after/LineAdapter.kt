package AdapterPattern.sample1.after

import AdapterPattern.sample1.shapes.Line

class LineAdapter(private var lineAdaptee : Line) : Shape {
    override fun draw(x: Int, y: Int, z: Int, w: Int) {
        lineAdaptee.draw(x, y, z, w)
    }
}