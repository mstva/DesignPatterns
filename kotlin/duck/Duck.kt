open class Duck(var name: String) {

    open fun quack() {
        println("$name is quacking")
    }

    fun swim() {
        println("$name is swimming")
    }

    open fun fly() {
        println("$name is flying")
    }

    fun display() {
        println("I am a $name")
    }

}