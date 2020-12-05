import ducks.*;

public class Main {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck("Mallard Duck");
        mallard.display();
        mallard.swim();
        mallard.performFly();
        mallard.performQuack();

        System.out.println("============================");

        Duck redhead = new RedheadDuck("Redhead Duck");
        redhead.display();
        redhead.swim();
        redhead.performFly();
        redhead.performQuack();

        System.out.println("============================");

        Duck rubber = new RubberDuck("Rubber Duck");
        rubber.display();
        rubber.swim();
        rubber.performFly();
        rubber.performQuack();

        System.out.println("============================");

        Duck decoy = new DecoyDuck("Decoy Duck");
        decoy.display();
        decoy.swim();
        decoy.performFly();
        decoy.performQuack();
    }
}
