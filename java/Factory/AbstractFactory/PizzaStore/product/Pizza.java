package product;

import factory.ingredients.cheese.Cheese;
import factory.ingredients.clams.Clam;
import factory.ingredients.dough.Dough;
import factory.ingredients.sauce.Sauce;

public abstract class Pizza {

    protected String name;

    protected Dough dough;
    protected Sauce sauce;
    protected Cheese cheese;
    protected Clam clam;

    public abstract void prepare();

    public void bake() {
        System.out.println("Baking the pizza within 25 minutes at 350");
    }

    public void cut() {
        System.out.println("cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Boxing the pizza into official PizzaBox");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
