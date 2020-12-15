package creator.stores;

import creator.PizzaStore;
import factory.IngredientFactory;
import factory.factories.ChicagoIngredientFactory;
import product.Pizza;
import product.pizzas.CheesePizza;
import product.pizzas.ClamPizza;
import product.pizzas.PepperoniPizza;
import product.pizzas.VeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {

        Pizza pizza = null;
        IngredientFactory chicagoIngredientFactory = new ChicagoIngredientFactory();

        switch (type) {
            case "cheese":
                pizza = new CheesePizza(chicagoIngredientFactory);
                pizza.setName("Chicago Style Cheese Pizza");
                break;
            case "veggie":
                pizza = new VeggiePizza(chicagoIngredientFactory);
                pizza.setName("Chicago Style Veggie Pizza");
                break;
            case "clam":
                pizza = new ClamPizza(chicagoIngredientFactory);
                pizza.setName("Chicago Style Clam Pizza");
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(chicagoIngredientFactory);
                pizza.setName("Chicago Style Pepperoni Pizza");
                break;
        }
        return pizza;
    }
}
