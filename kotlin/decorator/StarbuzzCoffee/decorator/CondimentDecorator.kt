package decorator

import component.Beverage

abstract class CondimentDecorator : Beverage() {

    abstract override fun getDescription(): String

    abstract override fun cost(): Double

}