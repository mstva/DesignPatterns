package component.coffees

import component.Beverage

class HouseBlend : Beverage() {

    init { description = "House Blend" }

    override fun cost(): Double { return 0.47 }

}