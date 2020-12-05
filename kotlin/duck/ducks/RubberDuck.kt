package ducks

import behaviors.fly.FlyNoWay
import behaviors.quack.Squeak

class RubberDuck(name: String) : Duck(name) {
    init {
        flyBehavior = FlyNoWay(name)
        quackBehavior = Squeak(name)
    }
}