package ducks

import behaviors.fly.FlyWithWings
import behaviors.quack.Quack

class MollardDuck(name: String) : Duck(name) {

    init {
        quackBehavior = Quack(name)
        flyBehavior = FlyWithWings(name)
    }
}