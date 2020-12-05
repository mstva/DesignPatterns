package behaviors.quack;

public class Squeak implements QuackBehavior {

    String name;
    public Squeak(String name) {
        this.name = name;
    }

    @Override
    public void quack() {
        System.out.println(name + " is squeaking");
    }
}
