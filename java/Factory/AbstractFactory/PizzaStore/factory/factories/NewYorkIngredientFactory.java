package factory.factories;

import factory.IngredientFactory;
import factory.ingredients.cheese.Cheese;
import factory.ingredients.cheese.MozzarellaCheese;
import factory.ingredients.clams.Clam;
import factory.ingredients.clams.FrozenClams;
import factory.ingredients.dough.Dough;
import factory.ingredients.dough.ThickCrustDough;
import factory.ingredients.sauce.PlumTomatoSauce;
import factory.ingredients.sauce.Sauce;

public class NewYorkIngredientFactory implements IngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Clam createClam() {
        return new FrozenClams();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }
}
