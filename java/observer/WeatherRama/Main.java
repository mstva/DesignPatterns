import observer.displays.CurrentConditionDisplay;
import observer.displays.ForecastDisplay;
import observer.displays.HeatIndexDisplay;
import observer.displays.StatisticsDisplay;
import subject.WeatherStation;

public class Main {

    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherStation);

        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherStation);

        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherStation);

        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherStation);

        weatherStation.setMeasurements(20, 65, 30.4f);

        weatherStation.removeObserver(heatIndexDisplay);

        weatherStation.setMeasurements(33, 80, 22.8f);

    }

}
