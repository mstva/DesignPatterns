#include "../Beverage.h"

class HouseBlend : public Beverage {

public:
    HouseBlend() { description = "HouseBlend"; }

    string getDescription() override { return description; }

    double cost() override { return 1.22; }
};
