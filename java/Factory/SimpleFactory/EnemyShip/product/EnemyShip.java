package product;

abstract public class EnemyShip {

    protected String name;
    protected Double damage;

    public void displayEnemyShip() {
        System.out.println("I am a " + name);
    }

    public void followEnemyShip() {
        System.out.println(name + " is following enemies");
    }

    public void damageEnemyShip() {
        System.out.println(name + " is damage enemy by " + damage);
    }

}
