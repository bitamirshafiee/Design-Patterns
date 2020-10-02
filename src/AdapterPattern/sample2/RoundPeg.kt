package AdapterPattern.sample2

open class RoundPeg {
    open var radius = 0.0

    constructor() {}
    constructor(radius: Double) {
        this.radius = radius
    }

}