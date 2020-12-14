package client;

import factory.EnemyShipFactory;
import product.EnemyShip;

public class EnemyShipStore {

    EnemyShipFactory enemyShipFactory;

    public EnemyShipStore(EnemyShipFactory enemyShipFactory) {
        this.enemyShipFactory = enemyShipFactory;
    }

    public void orderEnemyShip(String type) {

        EnemyShip enemyShip = enemyShipFactory.createEnemyShip(type);

        enemyShip.displayEnemyShip();
        enemyShip.followEnemyShip();
        enemyShip.damageEnemyShip();

    }

}
