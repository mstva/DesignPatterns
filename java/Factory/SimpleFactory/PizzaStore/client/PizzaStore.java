package client;

import factory.SimplePizzaFactory;
import product.Pizza;

public class PizzaStore {

    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) { this.factory = factory; }

    public Pizza orderPizza(String type) {

        Pizza pizza;

        pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;

    }
}
