package creator;

import product.Pizza;

abstract public class PizzaStore {

    protected abstract Pizza createPizza(String type);

    public void orderPizza(String type) {

        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

    }

}
