package behavior.quack

class Squeak(var duckName: String) : QuackBehavior {

    override fun quack() {
        println("$duckName is squeaking")
    }

}