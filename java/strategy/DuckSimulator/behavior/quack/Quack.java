package behavior.quack;

public class Quack implements QuackBehavior {

    private final String name;
    public Quack(String name) {
        this.name = name;
    }

    @Override
    public void quack() {
        System.out.println(name + " is quacking");
    }
}
