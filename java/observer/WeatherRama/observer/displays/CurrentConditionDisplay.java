package observer.displays;

import observer.Display;
import observer.Observer;
import subject.Subject;
import subject.WeatherStation;

public class CurrentConditionDisplay implements Observer, Display {

    private float temperature, humidity, pressure;
    private WeatherStation weatherStation;

    public CurrentConditionDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println(
                "Current Conditions:\n" +
                        temperature + "F degree\n" +
                        humidity + "% humidity\n" +
                        pressure + " pressure\n"
        );
    }
}
