import {CondimentDecorator} from "../CondimentDecorator.js";
import {Beverage} from "../../component/Beverage.js";

export class Mocha extends CondimentDecorator {

    beverage = new Beverage()

    constructor(beverage) {
        super();
        this.beverage = beverage
    }

    getDescription() {
        return this.beverage.getDescription() + ", Mocha"
    }

    cost() {
        return this.beverage.cost() + 0.99
    }

}