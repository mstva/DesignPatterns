package behaviors.quack

class MuteQuack(var name: String) : QuackBehavior {

    override fun quack() {
        println("$name is not quacking")
    }

}