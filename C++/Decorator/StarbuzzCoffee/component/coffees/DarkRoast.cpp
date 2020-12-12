#include "../Beverage.h"

class DarkRoast : public Beverage {

public:
    DarkRoast() { description = "DarkRoast"; }

    string getDescription() override { return description; }

    double cost() override { return 1.89; }
};
