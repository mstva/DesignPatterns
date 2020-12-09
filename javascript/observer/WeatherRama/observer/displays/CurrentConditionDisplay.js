import {Observer} from "../Observer.js";
import {WeatherStation} from "../../subject/WeatherStation.js";

export class CurrentConditionDisplay extends Observer {

    // private variables
    #temperature = 0
    #humidity = 0
    #pressure = 0

    #weatherStation = new WeatherStation()

    constructor(weatherStation) {
        super();
        this.#weatherStation = weatherStation
        this.#weatherStation.registerObserver(this)
    }

    update(temperature, humidity, pressure) {
        super.update(temperature, humidity, pressure);
        this.#temperature = temperature
        this.#humidity = humidity
        this.#pressure = pressure
        this.display()
    }

    display() {
        console.log("CurrentCondition:\n"
            + this.#temperature + "F degree\n"
            + this.#humidity + "% humidity\n"
            + this.#pressure + " pressure\n"
        )
    }

}