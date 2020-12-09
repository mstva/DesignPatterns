package subject

import observer.Observer

class WeatherStation() : Subject {

    private var temperature: Float? = null
    private var humidity: Float? = null
    private var pressure: Float? = null
    private var observers: ArrayList<Observer>? = null

    init {
        observers = ArrayList()
    }

    override fun registerObserver(newObserver: Observer) {
        observers!!.add(newObserver)
    }

    override fun removeObserver(removeObserver: Observer) {
        observers!!.remove(removeObserver)
    }

    override fun notifyObservers() {
        for (observer in observers!!) {
            observer.update(temperature!!, humidity!!, pressure!!)
        }
    }

    fun setMeasurements(temperature: Float, humidity: Float, pressure: Float) {

        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure

        notifyObservers()
    }

}