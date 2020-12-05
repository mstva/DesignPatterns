package behaviors.fly;

public class FlyWithWings implements FlyBehavior {

    String name;
    public FlyWithWings(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying");
    }
}
