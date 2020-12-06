#include "Duck.cpp"

class MallardDuck : public Duck {

public:
    explicit MallardDuck(string duckName) : Duck(duckName) {
        flyBehavior = new FlyWithWings(duckName);
        quackBehavior = new Quack(duckName);
    }
};

