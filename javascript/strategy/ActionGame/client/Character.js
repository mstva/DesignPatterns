import {WeaponBehavior} from "../behavior/WeaponBehavior.js";

export class Character {

    constructor() {
        this.weapon_behavior = new WeaponBehavior()
    }

    fight() {
        this.weapon_behavior.useWeapon()
    }

    setWeapon(wb) {
        this.weapon_behavior = wb
    }
}