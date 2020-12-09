package observer.displays

import observer.Display
import observer.Observer
import subject.WeatherStation

class ForecastDisplay(weatherStation: WeatherStation) : Observer, Display {

    private var currentPressure = 29.92f
    private var lastPressure = 0f

    private var weatherStation = WeatherStation()

    init {
        this.weatherStation = weatherStation
        weatherStation.registerObserver(this)
    }

    override fun update(temperature: Float, humidity: Float, pressure: Float) {
        lastPressure = currentPressure
        currentPressure = pressure
        display()
    }

    override fun display() {
        println("ForecastDisplay: ");
        if (currentPressure > lastPressure) {
            println("Improving weather on the way!\n");
        }
        else if (currentPressure == lastPressure) {
            println("More of the same\n");
        }
        else if (currentPressure < lastPressure) {
            println("Watch out for cooler, rainy weather\n");
        }
    }

}