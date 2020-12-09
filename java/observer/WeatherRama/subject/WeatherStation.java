package subject;

import observer.Observer;

import java.util.ArrayList;

public class WeatherStation implements Subject {

    private final ArrayList<Observer> observers;
    private float temperature, humidity, pressure;

    public WeatherStation() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void removeObserver(Observer removeObserver) {
        int observerIndex = observers.indexOf(removeObserver);
        if (observerIndex >= 0) {
            observers.remove(observerIndex);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }

    public float getTemperature() { return temperature; }

    public float getHumidity() { return humidity; }

    public float getPressure() { return pressure; }

}
