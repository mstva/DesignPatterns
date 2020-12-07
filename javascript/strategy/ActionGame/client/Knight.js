import {Character} from "./Character.js";
import { BowAndArrow } from "../behavior/WeaponBehavior.js";


export class Knight extends Character {

    constructor() {
        super();
        this.weapon_behavior = new BowAndArrow("Knight")
    }

}