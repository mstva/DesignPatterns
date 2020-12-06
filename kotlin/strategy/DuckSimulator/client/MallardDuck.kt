package client

import behavior.fly.FlyWithWings
import behavior.quack.Quack

class MallardDuck(duckName: String) : Duck(duckName) {

    init {
        flyBehavior = FlyWithWings(duckName)
        quackBehavior = Quack(duckName)
    }
}