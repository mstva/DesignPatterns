#include <iostream>

using namespace std;

class ForecastDisplay : public Observer, public Display {

public:
    explicit ForecastDisplay(WeatherStation* weatherStation) {
        this->weatherStation = weatherStation;
        this->weatherStation->registerObserver(this);
    }

    void update(float temperature, float humidity, float pressure) override {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }

    void display() override {
        cout << "\nForecastDisplay:" << endl;
        if (currentPressure > lastPressure) { cout << "Improving weather on the way!\n"; }
        else if (currentPressure == lastPressure) { cout << "More of the same\n"; }
        else if (currentPressure < lastPressure) { cout << "Watch out for cooler, rainy weather\n"; }
    }

private:
    WeatherStation* weatherStation = new WeatherStation();

    float currentPressure = 29.92;
    float lastPressure{};
};

