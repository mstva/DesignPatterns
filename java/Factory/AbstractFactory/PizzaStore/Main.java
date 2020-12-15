import creator.PizzaStore;
import creator.stores.ChicagoPizzaStore;
import product.Pizza;

public class Main {

    public static void main(String[] args) {

        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza pizza = chicagoPizzaStore.orderPizza("cheese");

        System.out.println(pizza);

    }

}
