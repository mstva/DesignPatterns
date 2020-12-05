import {Duck} from "./Duck.js";

export class RubberDuck extends Duck{
    constructor(name) {
        super(name);
    }

    quack() {
        super.quack();
        console.log(this.name + ' is squeaking')
    }

    fly() {
        super.fly();
        console.log(this.name + ' is not flying')
    }
}