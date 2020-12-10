#include "../Display.h"
#include "../Observer.h"
#include "../../subject/WeatherStation.cpp"
#include <iostream>

using namespace std;

class CurrentConditionDisplay : public Observer, public Display {

public:

    explicit CurrentConditionDisplay(WeatherStation* weatherStation) {
        this->weatherStation = weatherStation;
        this->weatherStation->registerObserver(this);
    }

    void update(float temperature, float humidity, float pressure) override {
        Temperature = temperature;
        Humidity = humidity;
        Pressure = pressure;
        display();
    }

    void display() override {
        cout << "\nCurrent Condition:" << endl;
        cout << Temperature << "F degree\n";
        cout << Humidity << "% humidity\n";
        cout << Pressure << " pressure\n";
    }

private:
    float Temperature{};
    float Humidity{};
    float Pressure{};

    WeatherStation* weatherStation = new WeatherStation();
};

