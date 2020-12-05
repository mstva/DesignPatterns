package client;

import behavior.fly.FlyWithWings;
import behavior.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck(String name) {
        super(name);
        flyBehavior = new FlyWithWings(name);
        quackBehavior = new Quack(name);
    }
}
