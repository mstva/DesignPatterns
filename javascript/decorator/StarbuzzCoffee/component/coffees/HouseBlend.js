import {Beverage} from "../Beverage.js";

export class HouseBlend extends Beverage {

    constructor() {
        super();
        this.description = "HouseBlend"
    }

    getDescription() { return this.description }

    cost() { return 0.59 }

}