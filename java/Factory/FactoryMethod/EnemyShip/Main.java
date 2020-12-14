import creator.ShipStore;
import creator.stores.EarthShipStore;

public class Main {

    public static void main(String[] args) {

        ShipStore shipStore = new EarthShipStore();

        shipStore.orderShip("UFO");

    }

}
