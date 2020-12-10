#include "Subject.h"
#include <vector>

using namespace std;

class WeatherStation : public Subject {

public:

    void registerObserver(Observer *newObserver) override {
        observers.push_back(newObserver);
    }

    void removeObserver(Observer *removeObserver) override {
        observers.erase(
                remove(observers.begin(), observers.end(), removeObserver),
                observers.end()
        );
    }

    void notifyObserver() override {
        for (auto & observer : observers) {
            observer->update(Temperature, Humidity, Pressure);
        }
    }

    void setMeasurements(float temperature, float humidity, float pressure) {
        Temperature = temperature;
        Humidity = humidity;
        Pressure = pressure;
        notifyObserver();
    }

private:
    float Temperature;
    float Humidity;
    float Pressure;

    vector<Observer *> observers;
};