package behavior.fly

class FlyNoWay(var duckName: String) : FlyBehavior {

    override fun fly() {
        println("$duckName is not flying")
    }

}