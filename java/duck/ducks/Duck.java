package ducks;

import behaviors.fly.FlyBehavior;
import behaviors.quack.QuackBehavior;

public abstract class Duck {

    private final String name;

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(String name) {
        this.name = name;
    }

    public void swim() {
        System.out.println(name + " is swimming");
    }

    public void display() {
        System.out.println("I am a " + name);
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

}
