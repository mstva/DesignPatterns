
class RubberDuck(name: String) : Duck(name) {

    override fun quack() {
        println("$name not quack, it squeaks")
    }

    override fun fly() {}
}