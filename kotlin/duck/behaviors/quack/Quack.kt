package behaviors.quack

class Quack(var name: String) : QuackBehavior {

    override fun quack() {
        println("$name is quacking")
    }
}