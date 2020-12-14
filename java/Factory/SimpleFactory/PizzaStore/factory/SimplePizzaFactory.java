package factory;

import product.Pizza;
import product.pizzas.CheesePizza;
import product.pizzas.ClamPizza;
import product.pizzas.PepperoniPizza;
import product.pizzas.VeggiePizza;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {

        Pizza pizza = null;

        switch (type) {
            case "Cheese":
                pizza = new CheesePizza();
                break;
            case "Pepperoni":
                pizza = new PepperoniPizza();
                break;
            case "Clam":
                pizza = new ClamPizza();
                break;
            case "Veggie":
                pizza = new VeggiePizza();
                break;
        }

        return pizza;
    }
}
