
export class QuackBehavior {
    quack() {}
}

export class Quack extends QuackBehavior {

    // private vars
    #duck_name

    constructor(duck_name) {
        super();
        this.#duck_name = duck_name
    }

    quack() {
        super.quack();
        console.log(this.#duck_name + " is quacking")
    }
}

export class Squeak extends QuackBehavior {

    // private vars
    #duck_name

    constructor(duck_name) {
        super();
        this.#duck_name = duck_name
    }

    quack() {
        super.quack();
        console.log(this.#duck_name + " is squeaking")
    }
}

export class MuteQuack extends QuackBehavior {

    // private vars
    #duck_name

    constructor(duck_name) {
        super();
        this.#duck_name = duck_name
    }

    quack() {
        super.quack();
        console.log(this.#duck_name + " is not quacking")
    }
}