#include "../Beverage.h"

class Decaf : public Beverage {

public:
    Decaf() { description = "Decaf"; }

    string getDescription() override { return description; }

    double cost() override { return 2.59; }
};
