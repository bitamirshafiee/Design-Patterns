package AdapterPattern.sample2

fun main(){

    val roundHole = RoundHole(5.0)
    val roundPeg = RoundPeg()

    if (roundHole.fits(roundPeg))
        println("RoundPeg fits RoundHole No Surprise")

    val squarePegSmall = SquarePeg(2.0)
    val squarePegBig = SquarePeg(20.0)

    val squarePegAdapterSmall = SquarePegAdapter(squarePegSmall)
    val squarePegAdapterBig = SquarePegAdapter(squarePegBig)

    if (roundHole.fits(squarePegAdapterSmall))
        println("Small SquarePeg fitted")
    if (!roundHole.fits(squarePegAdapterBig))
        println("Big SquarePeg not fitted")

}