
export class WeaponBehavior {
    useWeapon() {}
}

export class Axe extends WeaponBehavior {

    // private vars
    #character_name

    constructor(character_name) {
        super();
        this.#character_name = character_name
    }

    useWeapon() {
        super.useWeapon();
        console.log("the " + this.#character_name + " is fighting with Axe")
    }
}

export class Sword extends WeaponBehavior {

    // private vars
    #character_name

    constructor(character_name) {
        super();
        this.#character_name = character_name
    }

    useWeapon() {
        super.useWeapon();
        console.log("the " + this.#character_name + " is fighting with Sword")
    }
}

export class BowAndArrow extends WeaponBehavior {

    // private vars
    #character_name

    constructor(character_name) {
        super();
        this.#character_name = character_name
    }

    useWeapon() {
        super.useWeapon();
        console.log("the " + this.#character_name + " is fighting with BowAndArrow")
    }
}

export class Knife extends WeaponBehavior {

    // private vars
    #character_name

    constructor(character_name) {
        super();
        this.#character_name = character_name
    }

    useWeapon() {
        super.useWeapon();
        console.log("the " + this.#character_name + " is fighting with Knife")
    }
}