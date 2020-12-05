package behaviors.fly;

public class FlyNoWay implements FlyBehavior {

    String name;
    public FlyNoWay(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println(name + " is not flying");
    }
}
