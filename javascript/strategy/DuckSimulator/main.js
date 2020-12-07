import { MallardDuck } from "./client/MallardDuck.js";
import { RedheadDuck } from "./client/RedheadDuck.js";
import { RubberDuck } from "./client/RubberDuck.js";
import { Squeak } from "./behavior/QuackBehavior.js";

const mallard = new MallardDuck("MallardDuck")
mallard.display()
mallard.swim()
mallard.performFly()
mallard.performQuack()

const redhead = new RedheadDuck("RedheadDuck")
redhead.display()
redhead.swim()
redhead.performFly()
redhead.performQuack()

const rubber = new RubberDuck("RubberDuck")
rubber.display()
rubber.swim()
rubber.performFly()
rubber.performQuack()
rubber.setQuack(new Squeak("New RubberDuck"))
rubber.performQuack()



