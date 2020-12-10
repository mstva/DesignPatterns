#include <iostream>

using namespace std;

class Subscriber : Observer {

public:
    explicit Subscriber(Newsletter* newsletter) {
        this->newsletter = newsletter;
        this->newsletter->registerObserver(this);
    }

    void update(string name) override {
        _name = name;
        cout << "New Subscriber: +" << _name << " added to the newsletter" << endl;
    }

private:
    Newsletter* newsletter = new Newsletter();
    string _name;
};
