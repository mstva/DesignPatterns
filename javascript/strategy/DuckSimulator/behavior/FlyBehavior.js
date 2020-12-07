
export class FlyBehavior {
    fly() {}
}

export class FlyWithWings extends FlyBehavior {

    // private vars
    #duck_name

    constructor(duck_name) {
        super();
        this.#duck_name = duck_name
    }

    fly() {
        super.fly();
        console.log(this.#duck_name + " is flying with wings")
    }
}

export class FlyNoWay extends FlyBehavior {

    // private vars
    #duck_name

    constructor(duck_name) {
        super();
        this.#duck_name = duck_name
    }

    fly() {
        super.fly();
        console.log(this.#duck_name + " is not flying")
    }
}