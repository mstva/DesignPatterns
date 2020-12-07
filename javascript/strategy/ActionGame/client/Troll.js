import {Character} from "./Character.js";
import { Axe } from "../behavior/WeaponBehavior.js";


export class Troll extends Character {

    constructor() {
        super();
        this.weapon_behavior = new Axe("Troll")
    }

}