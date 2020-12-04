
class RubberDuck(name: String) : Duck(name), Quackable {

    override fun quack() {
        println("$name not quack, it squeaks")
    }
}