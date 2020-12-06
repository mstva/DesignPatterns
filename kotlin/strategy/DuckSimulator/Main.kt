import client.Duck
import client.MallardDuck
import client.RedheadDuck
import client.RubberDuck

fun main() {

    val mallard : Duck = MallardDuck("MallardDuck")
    mallard.display()
    mallard.swim()
    mallard.performFly()
    mallard.performQuack()

    val redhead : Duck = RedheadDuck("RedheadDuck")
    redhead.display()
    redhead.swim()
    redhead.performFly()
    redhead.performQuack()

    val rubber : Duck = RubberDuck("RubberDuck")
    rubber.display()
    rubber.swim()
    rubber.performFly()
    rubber.performQuack()

}