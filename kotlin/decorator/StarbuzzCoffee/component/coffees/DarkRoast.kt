package component.coffees

import component.Beverage

class DarkRoast : Beverage() {

    init { description = "Dark Roast" }

    override fun cost(): Double { return 1.98 }

}