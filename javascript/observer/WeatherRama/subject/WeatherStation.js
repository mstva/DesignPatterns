import {Subject} from "./Subject.js";
import {Observer} from "../observer/Observer.js";

export class WeatherStation extends Subject {

    // private variables
    #observers
    #temperature
    #humidity
    #pressure

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
            observer.update(this.#temperature, this.#humidity, this.#pressure)
        }
    }

    setMeasurements(temperature, humidity, pressure) {
        this.#temperature = temperature
        this.#humidity = humidity
        this.#pressure = pressure
        this.notifyObservers()
    }

}