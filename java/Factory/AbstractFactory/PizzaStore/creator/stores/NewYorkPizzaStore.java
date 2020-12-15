package creator.stores;

import creator.PizzaStore;
import factory.IngredientFactory;
import factory.factories.NewYorkIngredientFactory;
import product.Pizza;
import product.pizzas.CheesePizza;
import product.pizzas.ClamPizza;
import product.pizzas.PepperoniPizza;
import product.pizzas.VeggiePizza;

public class NewYorkPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {

        Pizza pizza = null;
        IngredientFactory newYorkIngredientFactory = new NewYorkIngredientFactory();

        switch (type) {
            case "cheese":
                pizza = new CheesePizza(newYorkIngredientFactory);
                pizza.setName("Chicago Style Cheese Pizza");
                break;
            case "veggie":
                pizza = new VeggiePizza(newYorkIngredientFactory);
                pizza.setName("Chicago Style Veggie Pizza");
                break;
            case "clam":
                pizza = new ClamPizza(newYorkIngredientFactory);
                pizza.setName("Chicago Style Clam Pizza");
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(newYorkIngredientFactory);
                pizza.setName("Chicago Style Pepperoni Pizza");
                break;
        }

        return pizza;
    }
}
