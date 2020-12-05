package behavior.fly;

public class FlyWithWings implements FlyBehavior {

    private final String name;
    public FlyWithWings(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying with wings");
    }

}
