package ducks

import behaviors.fly.FlyNoWay
import behaviors.quack.MuteQuack

class DecoyDuck(name: String) : Duck(name) {
    init {
        flyBehavior = FlyNoWay(name)
        quackBehavior = MuteQuack(name)
    }
}