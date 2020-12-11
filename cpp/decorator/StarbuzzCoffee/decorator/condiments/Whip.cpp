#include "../CondimentDecorator.h"

class Whip : public CondimentDecorator {

public:
    explicit Whip(Beverage* beverage) { this->beverage = beverage; }

    string getDescription() override { return beverage->getDescription() + ", Whip"; }

    double cost() override { return beverage->cost() + 0.10; }

private:
    Beverage* beverage;

};

