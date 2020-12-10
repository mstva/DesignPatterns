#include <iostream>

using namespace std;

class StatisticsDisplay : public Observer, public Display {

public:

    explicit StatisticsDisplay(WeatherStation *weatherStation) {
        this->weatherStation = weatherStation;
        this->weatherStation->registerObserver(this);
    }

    void update(float temperature, float humidity, float pressure) override {

        temperatureSum += temperature;
        numReadings++;

        if (temperature > maxTemperature) { maxTemperature = temperature; }
        if (temperature < minTemperature) { minTemperature = temperature; }

        display();
    }

    void display() override {
        cout << "\nStatisticsDisplay:" << endl;
        cout << "Avg temperature = " << (temperatureSum/numReadings) << "\n";
        cout << "Max temperature = " << maxTemperature << "\n";
        cout << "Min temperature = " << minTemperature << "\n";
    }

private:
    WeatherStation *weatherStation = new WeatherStation();

    float maxTemperature = 0.0;
    float minTemperature = 200;
    float temperatureSum = 0.0;
    float numReadings = 0;
};

