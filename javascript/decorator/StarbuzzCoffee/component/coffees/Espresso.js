import {Beverage} from "../Beverage.js";

export class Espresso extends Beverage {

    constructor() {
        super();
        this.description = "Espresso"
    }

    getDescription() { return this.description }

    cost() { return 1.99 }

}