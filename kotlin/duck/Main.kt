

fun main() {

    val mallard = MallardDuck("Mallard Duck")
    mallard.display()
    mallard.quack()
    mallard.swim()
    mallard.fly()

    println("========================")

    val redhead = RedheadDuck("Redhead Duck")
    redhead.display()
    redhead.quack()
    redhead.swim()
    redhead.fly()

    println("========================")

    val rubber = RubberDuck("Rubber Duck")
    rubber.display()
    rubber.quack()
    rubber.swim()

    println("========================")

    val decoy = DecoyDuck("Rubber Duck")
    decoy.display()
    decoy.swim()
}