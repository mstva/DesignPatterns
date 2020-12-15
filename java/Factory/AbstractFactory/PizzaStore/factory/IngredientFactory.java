package factory;

import factory.ingredients.cheese.Cheese;
import factory.ingredients.clams.Clam;
import factory.ingredients.dough.Dough;
import factory.ingredients.sauce.Sauce;

public interface IngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Clam createClam();
    Cheese createCheese();
}
