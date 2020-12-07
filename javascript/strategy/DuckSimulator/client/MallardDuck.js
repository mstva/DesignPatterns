import {Duck} from "./Duck.js";
import {FlyWithWings} from '../behavior/FlyBehavior.js'
import {Quack} from '../behavior/QuackBehavior.js'

export class MallardDuck extends Duck {

    constructor(duck_name) {
        super(duck_name)
        this.fly_behavior = new FlyWithWings(duck_name)
        this.quack_behavior = new Quack(duck_name)
    }
}