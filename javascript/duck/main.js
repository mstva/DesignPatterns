import { RedheadDuck } from "./ducks/RedheadDuck.js";
import { MallardDuck } from "./ducks/MallardDuck.js";
import { RubberDuck } from "./ducks/RubberDuck.js";
import { DecoyDuck } from "./ducks/DecoyDuck.js";

function main() {

    const mallard = new MallardDuck("MallardDuck")
    mallard.display()
    mallard.swim()
    mallard.quack()
    mallard.flyWithWings()

    const redhead = RedheadDuck("RedheadDuck")
    redhead.display()
    redhead.swim()
    redhead.squeak()
    redhead.flyWithWings()

    const rubber = RubberDuck("RubberDuck")
    rubber.display()
    rubber.swim()
    rubber.quack()
    rubber.flyNoWay()

    const decoy = DecoyDuck("DecoyDuck")
    decoy.display()
    decoy.swim()
    decoy.muteQuack()
    decoy.flyNoWay()
}

console.log(main())
