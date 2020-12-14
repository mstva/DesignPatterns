import creator.PizzaStore;
import creator.stores.ChicagoPizzaStore;

public class Main {

    public static void main(String[] args) {

        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        chicagoPizzaStore.orderPizza("Cheese");

    }

}
