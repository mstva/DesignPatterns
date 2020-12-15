package creator;

import factory.IngredientFactory;
import product.Pizza;
import product.pizzas.CheesePizza;
import product.pizzas.ClamPizza;
import product.pizzas.PepperoniPizza;
import product.pizzas.VeggiePizza;

public abstract class PizzaStore {

    protected abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type) {

        Pizza pizza;

        pizza = createPizza(type);

        System.out.println("--- Making a " + pizza.getName() + " ---");

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;

    }

}
