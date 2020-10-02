package AdapterPattern.sample2

import kotlin.math.pow
import kotlin.math.sqrt

class SquarePegAdapter(private var peg : SquarePeg) : RoundPeg(){

    //here adapter do the conversion to get the radius
    override var radius: Double
        get() = sqrt((peg.width / 2).pow(2) * 2)
        set(value) {}
}