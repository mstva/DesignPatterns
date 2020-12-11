package component.coffees

import component.Beverage

class Decaf : Beverage() {

    init { description = "Decaf" }

    override fun cost(): Double { return 0.78 }

}