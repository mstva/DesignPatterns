package ducks;

import behaviors.fly.FlyWithWings;
import behaviors.quack.Squeak;

public class RedheadDuck extends Duck {

    public RedheadDuck(String name) {
        super(name);
        flyBehavior = new FlyWithWings(name);
        quackBehavior = new Squeak(name);
    }
}
