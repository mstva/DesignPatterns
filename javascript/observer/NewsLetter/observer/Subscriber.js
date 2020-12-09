import {Observer} from "./Observer.js";
import {Newsletter} from "../subject/Newsletter.js";

export class Subscriber extends Observer {

    #name
    #newsletter = new Newsletter()

    constructor(newsLetter) {
        super();
        this.#newsletter = newsLetter
        this.#newsletter.registerObserver(this)
    }

    update(name) {
        super.update(name);
        this.#name = name
        this.display()
    }

    display() {
        console.log("New Subscriber: +" + this.#name + " added to the newsletter")
    }

}