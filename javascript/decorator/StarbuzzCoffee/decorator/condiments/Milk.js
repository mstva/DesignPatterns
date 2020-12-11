import {CondimentDecorator} from "../CondimentDecorator.js";
import {Beverage} from "../../component/Beverage.js";

export class Milk extends CondimentDecorator {

    beverage = new Beverage()

    constructor(beverage) {
        super();
        this.beverage = beverage
    }

    getDescription() {
        return this.beverage.getDescription() + ", Milk"
    }

    cost() {
        return this.beverage.cost() + 0.89
    }

}