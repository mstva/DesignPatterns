package observer.displays

import observer.Display
import observer.Observer
import subject.WeatherStation

class StatisticsDisplay(weatherStation: WeatherStation) : Observer, Display {

    private var maxTemperature = 0.0f
    private var minTemperature = 200f
    private var temperatureSum = 0.0f
    private var numReadings = 0

    private var weatherStation = WeatherStation()

    init {
        this.weatherStation = weatherStation
        weatherStation.registerObserver(this)
    }

    override fun update(temperature: Float, humidity: Float, pressure: Float) {

        temperatureSum += temperature
        numReadings++

        if (temperature > maxTemperature) { maxTemperature = temperature }

        if (temperature < minTemperature) { minTemperature = temperature }

        display()
    }

    override fun display() {
        println("StatisticsDisplay:\n"
                + "Avg temperature = " + (temperatureSum/numReadings) + "\n"
                + "Max temperature = " + maxTemperature + "\n"
                + "Min temperature = " + minTemperature + "\n"
        )
    }

}