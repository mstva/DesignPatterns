package behavior.quack;

public class Squeak implements QuackBehavior {

    private final String name;
    public Squeak(String name) {
        this.name = name;
    }

    @Override
    public void quack() {
        System.out.println(name + " is squeaking");
    }
}
