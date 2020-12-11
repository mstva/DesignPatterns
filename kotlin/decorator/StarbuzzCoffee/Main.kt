import component.Beverage
import component.coffees.DarkRoast
import component.coffees.Espresso
import decorator.condiments.Milk
import decorator.condiments.Mocha
import decorator.condiments.Soy
import decorator.condiments.Whip

fun main() {

    val espresso: Beverage = Mocha(Milk(Soy(Whip(Espresso()))))
    val darkRoast: Beverage = Whip(Mocha(Soy(Milk(DarkRoast()))))

    println("Description: " + espresso.getDescription())
    println("Cost: $" + espresso.cost())

    println("Description: " + darkRoast.getDescription())
    println("Cost: $" + darkRoast.cost())

}