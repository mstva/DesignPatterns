
class RedheadDuck(name: String) : Duck(name), Flyable, Quackable {

    override fun fly() {
        println("$name is flying")
    }

    override fun quack() {
        println("$name is quacking")
    }

}