#include "../CondimentDecorator.h"

class Soy : public CondimentDecorator {

public:
    explicit Soy(Beverage* beverage) { this->beverage = beverage; }

    string getDescription() override { return beverage->getDescription() + ", Soy"; }

    double cost() override { return beverage->cost() + 0.20; }

private:
    Beverage* beverage;

};

