package client

import behavior.fly.FlyNoWay
import behavior.quack.MuteQuack

class RubberDuck(duckName: String) : Duck(duckName) {

    init {
        flyBehavior = FlyNoWay(duckName)
        quackBehavior = MuteQuack(duckName)
    }

}