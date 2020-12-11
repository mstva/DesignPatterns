package component

abstract class Beverage {

    protected var description = "Unknown Beverage"

    internal open fun getDescription(): String { return description }

    abstract fun cost(): Double

}