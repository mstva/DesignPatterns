package product.pizzas;

import factory.IngredientFactory;
import product.Pizza;

public class ClamPizza extends Pizza {

    private final IngredientFactory ingredientFactory;

    public ClamPizza(IngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing + " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clam = ingredientFactory.createClam();
    }
}
