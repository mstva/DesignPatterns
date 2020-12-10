#include <iostream>
#include "observer/displays/CurrentConditionDisplay.cpp"
#include "observer/displays/ForecastDisplay.cpp"
#include "observer/displays/StatisticsDisplay.cpp"
#include "observer/displays/HeatIndexDisplay.cpp"

int main() {

    auto weatherStation = new WeatherStation();

    auto currentConditionDisplay = new CurrentConditionDisplay(weatherStation);

    auto forecastDisplay = new ForecastDisplay(weatherStation);

    auto statisticsDisplay = new StatisticsDisplay(weatherStation);

    auto heatIndexDisplay = new HeatIndexDisplay(weatherStation);

    weatherStation->setMeasurements(70, 57, 47.8);

    weatherStation->removeObserver(currentConditionDisplay);

    cout << "==========================" << endl;

    weatherStation->setMeasurements(36, 78, 24.1);

    cout << "==========================" << endl;

    weatherStation->setMeasurements(80, 40, 34.5);


}
