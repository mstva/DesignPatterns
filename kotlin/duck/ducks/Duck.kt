package ducks

import behaviors.fly.FlyBehavior
import behaviors.quack.QuackBehavior

open class Duck(private var name: String) {

    var flyBehavior: FlyBehavior? = null
    var quackBehavior: QuackBehavior? = null

    fun swim() {
        println("$name is swimming")
    }

    fun display() {
        println("I am a $name")
    }

    fun performFly() {
        flyBehavior!!.fly()
    }

    fun performQuack() {
        quackBehavior!!.quack()
    }
}