package decorator.condiments

import component.Beverage
import decorator.CondimentDecorator

class Whip(beverage: Beverage) : CondimentDecorator() {

    private var beverage: Beverage? = null

    init { this.beverage = beverage }

    override fun getDescription(): String { return beverage!!.getDescription() + ", Whip" }

    override fun cost(): Double { return beverage!!.cost() + 0.20 }

}