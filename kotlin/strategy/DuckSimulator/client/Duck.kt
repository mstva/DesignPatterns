package client

import behavior.fly.FlyBehavior
import behavior.quack.QuackBehavior

open class Duck(private var duckName: String) {

    protected open var flyBehavior: FlyBehavior? = null
    protected open var quackBehavior: QuackBehavior? = null

    fun display() { println("I am a $duckName") }

    fun swim() { println("$duckName is swimming") }

    fun performFly() { flyBehavior!!.fly() }

    fun performQuack() { quackBehavior!!.quack() }

}