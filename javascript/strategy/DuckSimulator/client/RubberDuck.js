import {Duck} from "./Duck.js";
import {FlyNoWay} from '../behavior/FlyBehavior.js'
import {MuteQuack} from '../behavior/QuackBehavior.js'

export class RubberDuck extends Duck {

    constructor(duck_name) {
        super(duck_name)
        this.fly_behavior = new FlyNoWay(duck_name)
        this.quack_behavior = new MuteQuack(duck_name)
    }
}