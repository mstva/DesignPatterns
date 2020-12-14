import client.EnemyShipStore;
import factory.EnemyShipFactory;

public class Main {

    public static void main(String[] args) {

        EnemyShipFactory enemyShipFactory = new EnemyShipFactory();

        EnemyShipStore enemyShipStore = new EnemyShipStore(enemyShipFactory);

        enemyShipStore.orderEnemyShip("UFO");

    }

}
