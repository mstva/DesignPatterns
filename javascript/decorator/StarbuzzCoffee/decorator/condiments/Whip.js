import {CondimentDecorator} from "../CondimentDecorator.js";
import {Beverage} from "../../component/Beverage.js";

export class Whip extends CondimentDecorator {

    beverage = new Beverage()

    constructor(beverage) {
        super();
        this.beverage = beverage
    }

    getDescription() {
        return this.beverage.getDescription() + ", Whip"
    }

    cost() {
        return this.beverage.cost() + 0.11
    }

}