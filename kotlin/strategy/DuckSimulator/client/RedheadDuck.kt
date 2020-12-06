package client

import behavior.fly.FlyWithWings
import behavior.quack.Squeak

class RedheadDuck(duckName: String) : Duck(duckName) {

    init {
        flyBehavior = FlyWithWings(duckName)
        quackBehavior = Squeak(duckName)
    }

}