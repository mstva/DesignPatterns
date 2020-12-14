package factory;

import product.EnemyShip;
import product.ships.RocketEnemyShip;
import product.ships.UFOEnemyShip;

public class EnemyShipFactory {

    public EnemyShip createEnemyShip(String type) {

        if (type.equals("UFO")) { return new UFOEnemyShip(); }
        else if (type.equals("Rocket")) { return new RocketEnemyShip(); }
        else return null;

    }

}
