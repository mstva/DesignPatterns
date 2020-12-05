package ducks;

import behaviors.fly.FlyNoWay;
import behaviors.quack.MuteQuack;

public class DecoyDuck extends Duck {

    public DecoyDuck(String name) {
        super(name);
        flyBehavior = new FlyNoWay(name);
        quackBehavior = new MuteQuack(name);
    }
}
