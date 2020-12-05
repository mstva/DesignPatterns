package ducks;

import behaviors.fly.FlyWithWings;
import behaviors.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck(String name) {
        super(name);
        quackBehavior = new Quack(name);
        flyBehavior = new FlyWithWings(name);
    }
}
