#include "../behavior/FlyBehavior.cpp"
#include "../behavior/QuackBehavior.cpp"
#include "iostream"
#include <string>
#include <utility>

using namespace std;

class FlyBehavior;
class QuackBehavior;

class Duck {

public:

    explicit Duck(string duckName) : duckName(move(duckName)) {}

    void display() { cout << "I am a " << duckName << endl; }

    void swim() { cout << duckName << " is swimming" << endl; }

    void performFly() { flyBehavior->fly(); }

    void performQuack() { quackBehavior->quack(); }

protected:
    FlyBehavior *flyBehavior{};
    QuackBehavior *quackBehavior{};

private:
    string duckName;
};