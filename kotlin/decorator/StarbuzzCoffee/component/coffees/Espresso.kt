package component.coffees

import component.Beverage

class Espresso : Beverage() {

    init { description = "Espresso" }

    override fun cost(): Double { return 1.99 }


}