import {CondimentDecorator} from "../CondimentDecorator.js";
import {Beverage} from "../../component/Beverage.js";

export class Soy extends CondimentDecorator {

    beverage = new Beverage()

    constructor(beverage) {
        super();
        this.beverage = beverage
    }

    getDescription() {
        return this.beverage.getDescription() + ", Soy"
    }

    cost() {
        return this.beverage.cost() + 0.22
    }

}