import {Beverage} from "../Beverage.js";

export class Decaf extends Beverage {

    constructor() {
        super();
        this.description = "Decaf"
    }

    getDescription() { return this.description }

    cost() { return 2.22 }

}