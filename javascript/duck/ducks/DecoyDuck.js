import {Duck} from "./Duck.js";

export class DecoyDuck extends Duck{
    constructor(name) {
        super(name);
    }

    quack() {
        super.quack();
        console.log(this.name + ' is not quacking')
    }

    fly() {
        super.fly();
        console.log(this.name + ' is not flying')
    }
}