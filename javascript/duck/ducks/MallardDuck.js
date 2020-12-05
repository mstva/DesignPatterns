import {Duck} from "./Duck.js";

export class MallardDuck extends Duck {
    constructor(name) {
        super(name);
    }

    quack() {
        super.quack();
        console.log(this.name + ' is quacking')
    }

    fly() {
        super.fly();
        console.log(this.name + ' is flying')
    }
}