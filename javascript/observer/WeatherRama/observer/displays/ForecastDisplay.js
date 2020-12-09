import {Observer} from "../Observer.js";
import {WeatherStation} from "../../subject/WeatherStation.js";

export class ForecastDisplay extends Observer{

    // private variables
    #currentPressure = 29.92
    #lastPressure

    #weatherStation = new WeatherStation()

    constructor(weatherStation) {
        super();
        this.#weatherStation = weatherStation
        this.#weatherStation.registerObserver(this)
    }

    update(temperature, humidity, pressure) {
        super.update(temperature, humidity, pressure);
        this.#lastPressure = this.#currentPressure
        this.#currentPressure = pressure
        this.display()
    }

    display() {
        console.log("ForecastDisplay:")

        if (this.#currentPressure > this.#lastPressure) {
            console.log("Improving weather on the way!\n")
        }

        else if (this.#currentPressure === this.#lastPressure) {
            console.log("More of the same\n")
        }

        else if (this.#currentPressure < this.#lastPressure) {
            console.log("Watch out for cooler, rainy weather\n")
        }
    }

}