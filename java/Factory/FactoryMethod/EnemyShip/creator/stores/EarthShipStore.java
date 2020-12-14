package creator.stores;

import creator.ShipStore;
import product.Ship;
import product.ships.earth.EarthStyleRocketShip;
import product.ships.earth.EarthStyleUFOShip;

public class EarthShipStore extends ShipStore {

    @Override
    protected Ship createShip(String type) {

        switch (type) {
            case "Rocket":
                return new EarthStyleRocketShip();
            case "UFO":
                return new EarthStyleUFOShip();
            default:
                return null;
        }

    }
}
