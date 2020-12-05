package client;

import behavior.fly.FlyNoWay;
import behavior.quack.MuteQuack;

public class RubberDuck extends Duck {

    public RubberDuck(String name) {
        super(name);
        flyBehavior = new FlyNoWay(name);
        quackBehavior = new MuteQuack(name);
    }
}
