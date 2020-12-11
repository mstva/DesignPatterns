import {Mocha} from "./decorator/condiments/Mocha.js";
import {Espresso} from "./component/coffees/Espresso.js";
import {Milk} from "./decorator/condiments/Milk.js";
import {Soy} from "./decorator/condiments/Soy.js";
import {Whip} from "./decorator/condiments/Whip.js";
import {DarkRoast} from "./component/coffees/DarkRoast.js";
import {HouseBlend} from "./component/coffees/HouseBlend.js";
import {Decaf} from "./component/coffees/Decaf.js";

const espresso = new Mocha(new Milk(new Soy(new Whip(new Espresso()))))

const darkRoast = new Soy(new Whip(new Mocha(new Milk(new DarkRoast()))))

const houseBlend = new Milk(new Mocha(new Whip(new Soy(new HouseBlend()))))

const decaf = new Whip(new Mocha(new Soy(new Milk(new Decaf()))))

console.log("\nDescription: " + espresso.getDescription())
console.log("Cost: $" + espresso.cost())

console.log("\nDescription: " + darkRoast.getDescription())
console.log("Cost: $" + darkRoast.cost())

console.log("\nDescription: " + houseBlend.getDescription())
console.log("Cost: $" + houseBlend.cost())

console.log("\nDescription: " + decaf.getDescription())
console.log("Cost: $" + decaf.cost())