import {Character} from "./Character.js";
import { Sword } from "../behavior/WeaponBehavior.js";


export class King extends Character {

    constructor() {
        super();
        this.weapon_behavior = new Sword("King")
    }

}