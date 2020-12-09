package observer.displays

import observer.Display
import observer.Observer
import subject.WeatherStation

class CurrentConditionDisplay(weatherStation: WeatherStation) : Observer, Display {

    private var temperature: Float? = null
    private var humidity: Float? = null
    private var pressure: Float? = null

    private var weatherStation = WeatherStation()

    init {
        this.weatherStation = weatherStation
        weatherStation.registerObserver(this)
    }

    override fun update(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure

        display()
    }

    override fun display() {
        println("Current Conditions:\n"
                + temperature + "F degree\n"
                + humidity + "% humidity\n"
                + pressure + " pressure\n"
        )
    }

}