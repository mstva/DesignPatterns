package behaviors.fly

class FlyWithWings(var name: String) : FlyBehavior {

    override fun fly() {
        println("$name is flying")
    }
}