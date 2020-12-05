package behaviors.fly

class FlyNoWay(var name: String) : FlyBehavior {

    override fun fly() {
        println("$name is not flying")
    }
}