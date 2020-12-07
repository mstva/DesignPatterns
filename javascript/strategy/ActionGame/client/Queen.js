import {Character} from "./Character.js";
import { Knife } from "../behavior/WeaponBehavior.js";


export class Queen extends Character {

    constructor() {
        super();
        this.weapon_behavior = new Knife("Queen")
    }

}