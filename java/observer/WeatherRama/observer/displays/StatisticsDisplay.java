package observer.displays;

import observer.Display;
import observer.Observer;
import subject.Subject;
import subject.WeatherStation;

public class StatisticsDisplay implements Observer, Display {

    private float maxTemperature = 0.0f;
    private float minTemperature = 200;
    private float temperatureSum= 0.0f;
    private int numReadings;
    private WeatherStation weatherStation;

    public StatisticsDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {

        temperatureSum += temperature;
        numReadings++;

        if (temperature > maxTemperature) {
            maxTemperature = temperature;
        }

        if (temperature < minTemperature) {
            minTemperature = temperature;
        }

        display();
    }

    @Override
    public void display() {
        System.out.println("StatisticsDisplay: \n" +
                "Avg temperature = " + (temperatureSum/numReadings) + "\n" +
                "Max temperature = " + maxTemperature + "\n" +
                "Min temperature = " + minTemperature + "\n"
        );
    }
}
