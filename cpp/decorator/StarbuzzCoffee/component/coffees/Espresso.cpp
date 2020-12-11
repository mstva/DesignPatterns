#include "../Beverage.h"

class Espresso : public Beverage {

public:
    Espresso() { description = "Espresso"; }

    string getDescription() override { return description; }

    double cost() override { return 1.99; }
};
