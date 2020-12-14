package product;

abstract public class Ship {

    protected String name;
    protected Double damage;

    public void displayShip() {
        System.out.println(name + " is displaying on screen");
    }

    public void followEnemy() {
        System.out.println(name + " is following enemies");
    }

    public void damageEnemy() {
        System.out.println(name + " is damage enemy by " + damage);
    }

}
