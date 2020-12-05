package ducks

import behaviors.fly.FlyWithWings
import behaviors.quack.Squeak

class RedheadDuck(name: String) : Duck(name) {

    init {
        quackBehavior = Squeak(name)
        flyBehavior = FlyWithWings(name)
    }

}