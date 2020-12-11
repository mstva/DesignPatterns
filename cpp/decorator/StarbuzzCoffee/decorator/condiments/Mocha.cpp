#include "../CondimentDecorator.h"

class Mocha : public CondimentDecorator {

public:
    explicit Mocha(Beverage* beverage) { this->beverage = beverage; }

    string getDescription() override { return beverage->getDescription() + ", Mocha"; }

    double cost() override { return beverage->cost() + 0.99; }

private:
    Beverage* beverage;

};

