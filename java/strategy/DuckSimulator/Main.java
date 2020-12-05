import behavior.fly.FlyNoWay;
import client.Duck;
import client.MallardDuck;
import client.RedheadDuck;
import client.RubberDuck;

public class Main {

    public static void main(String[] args) {

        Duck mallard = new MallardDuck("MallardDuck");
        mallard.display();
        mallard.swim();
        mallard.performFly();
        mallard.performQuack();

        Duck redhead = new RedheadDuck("RedheadDuck");
        redhead.display();
        redhead.swim();
        redhead.performFly();
        redhead.performQuack();

        Duck rubber = new RubberDuck("RubberDuck");
        rubber.display();
        rubber.swim();
        rubber.performFly();
        rubber.performQuack();

    }

}
