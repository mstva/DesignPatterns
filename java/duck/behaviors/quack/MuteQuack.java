package behaviors.quack;

public class MuteQuack implements QuackBehavior {

    String name;

    public MuteQuack(String name) {
        this.name = name;
    }

    @Override
    public void quack() {
        System.out.println(name + " is not quacking");
    }
}
