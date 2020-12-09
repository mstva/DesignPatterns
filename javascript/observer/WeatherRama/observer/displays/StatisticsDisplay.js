import {Observer} from "../Observer.js";
import {WeatherStation} from "../../subject/WeatherStation.js";

export class StatisticsDisplay extends Observer {

    #maxTemperature = 0.0
    #minTemperature = 200
    #temperatureSum= 0.0
    #numReadings = 0

    #weatherStation = new WeatherStation()

    constructor(weatherStation) {
        super();
        this.#weatherStation = weatherStation
        this.#weatherStation.registerObserver(this)
    }

    update(temperature, humidity, pressure) {
        super.update(temperature, humidity, pressure);
        this.#temperatureSum += temperature
        this.#numReadings++

        if (temperature > this.#maxTemperature) { this.#maxTemperature = temperature }
        if (temperature < this.#minTemperature) { this.#minTemperature = temperature }

        this.display()
    }

    display() {
        console.log("StatisticsDisplay: \n" +
            "Avg temperature = " + (this.#temperatureSum/this.#numReadings) + "\n" +
            "Max temperature = " + this.#maxTemperature + "\n" +
            "Min temperature = " + this.#minTemperature + "\n"
        )
    }
}