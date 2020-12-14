package creator;

import product.Ship;

abstract public class ShipStore {

    abstract protected Ship createShip(String type);

    public void orderShip(String type) {

        Ship ship = createShip(type);

        ship.displayShip();
        ship.followEnemy();
        ship.damageEnemy();

    }
}
