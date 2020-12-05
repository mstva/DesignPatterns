import {generalBehavior} from "../behaviors/GeneralBehavior.js";
import {flyBehavior} from "../behaviors/FlyBehavior.js";
import {quackBehavior} from "../behaviors/QuackBehavior.js";

export function DecoyDuck(name) {
    const duck = { name: name }
    return {
        ...duck,
        ...generalBehavior(duck),
        ...flyBehavior(duck),
        ...quackBehavior(duck)
    }
}