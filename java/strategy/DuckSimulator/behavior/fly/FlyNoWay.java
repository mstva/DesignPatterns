package behavior.fly;

public class FlyNoWay implements FlyBehavior {

    private final String name;
    public FlyNoWay(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println(name + " is not flying");
    }
}
