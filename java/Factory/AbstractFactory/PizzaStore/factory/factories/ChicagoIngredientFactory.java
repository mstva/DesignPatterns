package factory.factories;

import factory.IngredientFactory;
import factory.ingredients.cheese.Cheese;
import factory.ingredients.cheese.ReggianoCheese;
import factory.ingredients.clams.Clam;
import factory.ingredients.clams.FreshClams;
import factory.ingredients.clams.FrozenClams;
import factory.ingredients.dough.Dough;
import factory.ingredients.dough.ThinCrustDough;
import factory.ingredients.sauce.MarinaraSauce;
import factory.ingredients.sauce.Sauce;

public class ChicagoIngredientFactory implements IngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Clam createClam() {
        return new FreshClams();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }
}
