package AdapterPattern.sample2

class SquarePeg(val width: Double) {

    val square: Double
        get() {
            return Math.pow(width, 2.0)
        }

}