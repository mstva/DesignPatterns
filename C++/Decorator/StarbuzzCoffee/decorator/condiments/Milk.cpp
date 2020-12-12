#include "../CondimentDecorator.h"

class Milk : public CondimentDecorator {

public:
    explicit Milk(Beverage* beverage) { this->beverage = beverage; }

    string getDescription() override { return beverage->getDescription() + ", Milk"; }

    double cost() override { return beverage->cost() + 0.89; }

private:
    Beverage* beverage;

};

