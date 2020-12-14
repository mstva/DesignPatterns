import client.PizzaStore;
import factory.SimplePizzaFactory;
import product.Pizza;

public class Main {

    public static void main(String[] args) {

        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(factory);

        Pizza pizza = pizzaStore.orderPizza("Cheese");
        
        System.out.println(pizza);

    }

}
