import { RedheadDuck } from "./ducks/RedheadDuck.js";
import { MallardDuck } from "./ducks/MallardDuck.js";
import { RubberDuck } from "./ducks/RubberDuck.js";
import { DecoyDuck } from "./ducks/DecoyDuck.js";

function main() {

    let mallard = new MallardDuck("MallardDuck")
    let redhead = new RedheadDuck("RedheadDuck")
    let rubber = new RubberDuck("RubberDuck")
    let decoy = new DecoyDuck("DecoyDuck")

    mallard.display()
    mallard.quack()
    mallard.swim()
    mallard.fly()

    console.log("============================")

    redhead.display()
    redhead.quack()
    redhead.swim()
    redhead.fly()

    console.log("============================")

    rubber.display()
    rubber.swim()
    rubber.quack()
    rubber.fly()

    console.log("============================")

    decoy.display()
    decoy.swim()
    decoy.quack()
    decoy.fly()
}

console.log(main())
