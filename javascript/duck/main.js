import { RedheadDuck } from "./RedheadDuck.js";
import { MollardDuck } from "./MollardDuck.js";


function main() {

    let mollard = new MollardDuck("mollard")
    let redhead = new RedheadDuck("redhead")

    mollard.display()
    mollard.quack()
    mollard.swim()

    redhead.display()
    redhead.quack()
    redhead.swim()
}

console.log(main())
