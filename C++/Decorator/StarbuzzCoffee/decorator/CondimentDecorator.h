#ifndef STARBUZZCOFFEE_CONDIMENTDECORATOR_H
#define STARBUZZCOFFEE_CONDIMENTDECORATOR_H

#include "../component/Beverage.h"

class CondimentDecorator : public Beverage {

public:

    string getDescription() override = 0;

    double cost() override = 0;

};


#endif
