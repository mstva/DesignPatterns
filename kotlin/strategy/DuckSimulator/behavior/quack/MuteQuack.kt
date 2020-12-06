package behavior.quack

class MuteQuack(var duckName: String) : QuackBehavior {

    override fun quack() {
        println("$duckName is not quacking")
    }
}