package behavior.quack;

public class MuteQuack implements QuackBehavior {

    private final String name;
    public MuteQuack(String name) {
        this.name = name;
    }

    @Override
    public void quack() {
        System.out.println(name + " is not quacking");
    }
}
