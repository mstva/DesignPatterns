package creator.stores;

import creator.PizzaStore;
import product.Pizza;
import product.pizzas.newyork.NewYorkStyleCheesePizza;
import product.pizzas.newyork.NewYorkStyleClamPizza;
import product.pizzas.newyork.NewYorkStyleVeggiePizza;

public class NewYorkPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {

        switch (type) {
            case "Cheese":
                return new NewYorkStyleCheesePizza();
            case "Clam":
                return new NewYorkStyleClamPizza();
            case "Veggie":
                return new NewYorkStyleVeggiePizza();
            default:
                return null;
        }
    }
}
