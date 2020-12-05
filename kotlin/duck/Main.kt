import ducks.*

fun main() {
    val mallard: Duck = MollardDuck("Mallard Duck")
    mallard.display()
    mallard.swim()
    mallard.performFly()
    mallard.performQuack()

    println("===========================")

    val redhead: Duck = RedheadDuck("Redhead Duck")
    redhead.display()
    redhead.swim()
    redhead.performFly()
    redhead.performQuack()

    println("===========================")

    val rubber: Duck = RubberDuck("Rubber Duck")
    rubber.display()
    rubber.swim()
    rubber.performFly()
    rubber.performQuack()

    println("===========================")

    val decoy: Duck = DecoyDuck("Decoy Duck")
    decoy.display()
    decoy.swim()
    decoy.performFly()
    decoy.performQuack()
}