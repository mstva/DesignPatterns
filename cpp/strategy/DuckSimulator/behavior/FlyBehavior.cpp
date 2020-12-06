#include "iostream"
#include <string>
using namespace std;

class FlyBehavior {

public:
    virtual void fly() = 0;
};

class FlyWithWings : public FlyBehavior {

public:
    FlyWithWings(string duckName) : duckName(duckName) {};
    void fly() override { cout << duckName << " is flying" << endl; };

private:
    string duckName;
};

class FlyNoWay : public FlyBehavior {

public:
    FlyNoWay(string duckName) : duckName(duckName) {};
    void fly() override { cout << duckName << " is not flying" << endl; };

private:
    string duckName;
};

