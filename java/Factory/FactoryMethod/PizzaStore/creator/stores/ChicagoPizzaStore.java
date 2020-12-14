package creator.stores;

import creator.PizzaStore;
import product.Pizza;
import product.pizzas.chicago.ChicagoStyleCheesePizza;
import product.pizzas.chicago.ChicagoStyleClamPizza;
import product.pizzas.chicago.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {

        switch (type) {
            case "Cheese":
                return new ChicagoStyleCheesePizza();
            case "Clam":
                return new ChicagoStyleClamPizza();
            case "Veggie":
                return new ChicagoStyleVeggiePizza();
            default:
                return null;
        }

    }
}
