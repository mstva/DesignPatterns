package behaviors.quack

class Squeak(var name: String) : QuackBehavior {

    override fun quack() {
        println("$name is squeaking")
    }
}