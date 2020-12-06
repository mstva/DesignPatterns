package behavior.quack

class Quack(var duckName: String) : QuackBehavior {

    override fun quack() {
        println("$duckName is quacking")
    }

}