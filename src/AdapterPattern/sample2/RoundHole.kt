package AdapterPattern.sample2

class RoundHole(private val radius: Double) {

    fun fits(peg: RoundPeg): Boolean {
        return radius >= peg.radius
    }

}