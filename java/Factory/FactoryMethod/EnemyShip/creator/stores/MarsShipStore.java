package creator.stores;

import creator.ShipStore;
import product.Ship;
import product.ships.mars.MarsStyleRocketShip;
import product.ships.mars.MarsStyleUFOShip;

public class MarsShipStore extends ShipStore {

    @Override
    protected Ship createShip(String type) {

        switch (type) {
            case "Rocket":
                return new MarsStyleRocketShip();
            case "UFO":
                return new MarsStyleUFOShip();
            default:
                return null;
        }

    }
}
