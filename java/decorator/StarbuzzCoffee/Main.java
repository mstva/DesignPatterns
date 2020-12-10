import component.Beverage;
import component.coffees.DarkRoast;
import component.coffees.Espresso;
import decorator.condiments.Milk;
import decorator.condiments.Mocha;
import decorator.condiments.Soy;
import decorator.condiments.Whip;

public class Main {

    public static void main(String[] args) {

        Beverage espresso = new Mocha(new Milk(new Soy(new Espresso())));
        System.out.println("\nYour Coffee:"
                + "\nDescription: " + espresso.getDescription()
                + "\nCost: " + Math.floor(espresso.cost())
        );

        System.out.println("=====================");

        Beverage darkRoast = new Whip(new Soy(new Milk(new DarkRoast())));
        System.out.println("\nYour Coffee:"
                + "\nDescription: " + darkRoast.getDescription()
                + "\nCost: " + Math.floor(darkRoast.cost())
        );
    }

}
