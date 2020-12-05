package client;

import behavior.fly.FlyBehavior;
import behavior.quack.QuackBehavior;

public class Duck {

    private final String name;

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(String name) { this.name = name; }

    public void display() { System.out.println("I am a " + name); }

    public void swim() { System.out.println(name + " is swimming"); }

    public void performFly() { flyBehavior.fly(); }

    public void performQuack() { quackBehavior.quack(); }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
