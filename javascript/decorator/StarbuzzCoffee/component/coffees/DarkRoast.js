import {Beverage} from "../Beverage.js";

export class DarkRoast extends Beverage {

    constructor() {
        super();
        this.description = "DarkRoast"
    }

    getDescription() { return this.description }

    cost() { return 1.89 }

}