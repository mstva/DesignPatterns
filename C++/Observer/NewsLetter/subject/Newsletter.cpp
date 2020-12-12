
#include "Subject.h"
#include <utility>
#include <vector>

using namespace std;

class Newsletter : Subject {

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

    void notifyObservers() override {
        for (auto & observer : observers) {
            observer->update(_name);
        }
    }

    void setName(string name) {
        _name = move(name);
        notifyObservers();
    }

private:
    vector<Observer*> observers;
    string _name;
};
