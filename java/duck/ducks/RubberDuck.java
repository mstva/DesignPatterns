package ducks;

import behaviors.fly.FlyWithWings;
import behaviors.quack.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck(String name) {
        super(name);
        flyBehavior = new FlyWithWings(name);
        quackBehavior = new Squeak(name);
    }
}
