import { FlyBehavior } from "../behavior/FlyBehavior.js";
import { QuackBehavior } from "../behavior/QuackBehavior.js";

export class Duck {

    // private vars
    #duck_name

    constructor(duck_name) {
        this.#duck_name = duck_name
        this.fly_behavior = new FlyBehavior()
        this.quack_behavior = new QuackBehavior()
    }

    display() {
        console.log("I am a " + this.#duck_name)
    }

    swim() {
        console.log(this.#duck_name + " is swimming")
    }

    performFly() {
        this.fly_behavior.fly()
    }

    performQuack() {
        this.quack_behavior.quack()
    }

    setFly(fb) {
        this.fly_behavior = fb
    }

    setQuack(qb) {
        this.quack_behavior = qb
    }

}