package behavior.fly

class FlyWithWings(var duckName: String) : FlyBehavior {

    override fun fly() {
        println("$duckName is flying")
    }

}