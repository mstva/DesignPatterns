package behaviors.quack;

public class Quack implements QuackBehavior {

    String name;
    public Quack(String name) {
        this.name = name;
    }

    @Override
    public void quack() {
        System.out.println(name + " is quacking");
    }
}
