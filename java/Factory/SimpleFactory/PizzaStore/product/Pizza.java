package product;

import java.util.ArrayList;
import java.util.List;

abstract public class Pizza {

    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> toppings = new ArrayList<>();

    public void prepare() { System.out.println("preparing " + name ); }
    public void bake() { System.out.println("baking " + name ); }
    public void cut() { System.out.println("cutting " + name ); }
    public void box() { System.out.println("boxing " + name ); }

    public String toString() {
        // code to display pizza name and ingredients
        StringBuilder display = new StringBuilder();
        display.append("---- ").append(name).append(" ----\n");
        display.append(dough).append("\n");
        display.append(sauce).append("\n");
        for (String topping : toppings) {
            display.append(topping).append("\n");
        }
        return display.toString();
    }
}
