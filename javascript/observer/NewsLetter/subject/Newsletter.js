import {Subject} from "./Subject.js";
import {Observer} from "../observer/Observer.js";

export class Newsletter extends Subject{

    #name
    #observers

    constructor() {
        super();
        this.#observers = []
    }

    registerObserver(newObserver) {
        super.registerObserver(newObserver);
        this.#observers.push(newObserver)
    }

    removeObserver(removeObserver) {
        super.removeObserver(removeObserver);
        let index = this.#observers.indexOf(removeObserver)
        this.#observers.splice(index, 1)
    }

    notifyObservers() {
        super.notifyObservers();
        let observer = new Observer()
        for (observer of this.#observers) {
            observer.update(this.#name)
        }
    }

    setName(name) {
        this.#name = name
        this.notifyObservers()
    }

}