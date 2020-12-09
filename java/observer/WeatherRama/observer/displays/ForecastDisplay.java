package observer.displays;

import observer.Display;
import observer.Observer;
import subject.WeatherStation;

public class ForecastDisplay implements Observer, Display {

    private float currentPressure = 29.92f;
    private float lastPressure;
    private WeatherStation weatherStation;

    public ForecastDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("ForecastDisplay: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!\n");
        }
        else if (currentPressure == lastPressure) {
            System.out.println("More of the same\n");
        }
        else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather\n");
        }
    }
}
